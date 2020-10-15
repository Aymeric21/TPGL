package fr.ufrsciencestech.panier;

public class Ananas extends FruitSimple{
    private double prix;
    private String origine;
	
    public Ananas()
    {
        this.prix = 2;  //prix en euros
        this.origine="Bresil";
    }
    
    public Ananas(double prix, String origine)  //modifie par C. Roudet
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Bresil";  //Espagne par défaut
	else
            this.origine = origine;   
    }
    
    public String getNom()
    {
        return "Ananas";
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
        return "Ananas de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Ananas or = (Ananas) o;                                  //modifie par C. Roudet
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Ananas");
	Orange o = new Orange();
	System.out.println(o.getPrix());
	o.setPrix(-2.0);
	System.out.println(o.getPrix());
	Orange o2 = new Orange(-3.0, "RDC");
	
	System.out.println(o2.getPrix());
	
   }

    @Override
    FruitSimple createFruit(double prix, String origine)
    {
        return new Ananas(prix, origine);
    }

    @Override
    FruitSimple createFruitNull() {
        return null;
    }
}

