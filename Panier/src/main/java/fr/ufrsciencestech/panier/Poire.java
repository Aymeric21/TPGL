package fr.ufrsciencestech.panier;


import fr.ufrsciencestech.panier.Fruit;
import fr.ufrsciencestech.panier.Fruit;


/**
 *
 * @author roudet
 */
public class Poire extends FruitSimple{
    private double prix;
    private String origine;
	
    public Poire() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Poire(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }
    
    public String getNom()
    {
        return "Poire";
    }


    @Override
    public String toString(){
        return "Poire de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 poires sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Poire or = (Poire) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une poire a des pepins
        return false;
    }


    public static void main (String[] args){
      Poire p=new Poire(0.5,"Portugal");
	System.out.println(p.toString());
   }

    @Override
    FruitSimple createFruit(double prix, String origine)
    {
        return new Poire(prix, origine);
    }

    @Override
    FruitSimple createFruitNull() {
        return null;
    }
}
