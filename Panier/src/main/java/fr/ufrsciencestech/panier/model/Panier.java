package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.Fruit;
import fr.ufrsciencestech.panier.Macedoine;
import fr.ufrsciencestech.panier.Orange;
import fr.ufrsciencestech.panier.PanierPleinException;
import fr.ufrsciencestech.panier.PanierVideException;
import fr.ufrsciencestech.panier.controler.Controleur;
import fr.ufrsciencestech.panier.view.VueConsole;
import fr.ufrsciencestech.panier.view.VueGraphSwing;
import fr.ufrsciencestech.panier.view.VueGraphAwt;
import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier extends Observable{
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum de fruits que peut contenir le panier
	
    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
	this.contenanceMax = contenanceMax;
	fruits = new ArrayList<Fruit>();
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
	String s = "";
	for(int i=0;i<getTaillePanier();i++)
	{
		s+= fruits.get(i).toString() + " \n\n";
	}
        return s;
    }
    
    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return this.fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
      
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size() ;
    }
    
    public int getContenanceMax(){  //accesseur du second attribut
	return this.contenanceMax;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	Fruit f = this.fruits.get(i);
	return f;
    }
    
    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
	this.fruits.set(i, f);
    }
    
    public boolean estVide(){  //predicat indiquant que le panier est vide
	return this.fruits.isEmpty();
    }
    
    public boolean estPlein(){  //predicat indiquant que le panier est plein
	boolean estPlein = false;
      	if(this.fruits.size() == this.contenanceMax)
       		estPlein = true;
	return estPlein;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
	if (!estPlein()){
		fruits.add(o);
                
            /*setChanged();
            notifyObservers(this);*/
	}
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
	if(this.fruits.size() > 0)
        {
            this.fruits.remove(this.fruits.size() - 1);
            
            /*setChanged();
            notifyObservers(this);*/
        }
        
        
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	double prix = 0;
	for(int i = 0 ; i < this.fruits.size(); i++)
		 prix = prix + this.fruits.get(i).getPrix();

	return prix;
    }
    
    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
		for (int i = 0 ;i<fruits.size();i++){
			if (fruits.get(i).getOrigine().equals(origine) ){
				fruits.remove(fruits.get(i));
			}
		}
    }
        
    //groupe 8    
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        return false;
    }
    
    //tests
    public static void main (String[] args){  //modifie par C. Roudet
        
        Orange o1 = new Orange();
        Orange o2 = new Orange(50, "France");
        Macedoine mace = new Macedoine();
        mace.ajout(o2);
        mace.ajout(o1);
        mace.ajout(o2);
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
       
        Macedoine mace2 = new Macedoine(fruits);
        
        Panier panier = new Panier(5);
        
        try
        {
            panier.ajout(o1);
            panier.ajout(o2);
            mace.toString();
            System.out.print(mace.toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        //Utilisation de Swing
        //VueGraphSwing vueg = new VueGraphSwing();
        //ou utilisation de AWT
        VueGraphAwt vueg = new VueGraphAwt();
        Controleur controleur = new Controleur();
        VueConsole vuec = new VueConsole();
        
        controleur.setModele(panier);
        panier.addObserver(vueg);
        panier.addObserver(vuec);
        vueg.addControleur(controleur);
    }
    
    
    
    public void update(int incr)
    {
        try
        {
            if(incr == 1)
            {
                //Ajout orange
                this.ajout(new Orange());
                //System.out.println("ajout");
            }
            else
            {
                //Supression orange
                this.retrait();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(this);   //if this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed
    }

}
