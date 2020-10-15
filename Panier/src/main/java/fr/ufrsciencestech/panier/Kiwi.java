package fr.ufrsciencestech.panier;

/**
 *
 * @author roudet
 */
public class Kiwi extends FruitSimple{              //modifie par C. Roudet
    private double prix;
    private String origine;
	
    public Kiwi()   //modifie par C. Roudet
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Kiwi(double prix, String origine)  //modifie par C. Roudet
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine ="Espagne";  //Espagne par defaut
	else
            this.origine = origine;   
    }
    
    public String getNom()
    {
        return "Kiwi";
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Kiwi de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Kiwi or = (Kiwi) o;                                        //modifie par C. Roudet
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Kiwi");
   }

    @Override
    FruitSimple createFruit(double prix, String origine)
    {
        return new Kiwi(prix, origine);
    }

    @Override
    FruitSimple createFruitNull() {
        return null;
    }
}
