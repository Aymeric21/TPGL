/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author ag184397
 */
public class Macedoine implements Fruit{
    private double prix;
    ArrayList<Fruit> macedoine;

    public Macedoine()
    {
        macedoine = new ArrayList<Fruit>();
        prix = 0;
    }
    
    public void ajout(Fruit f){
        macedoine.add(f);
    }
    
    public Macedoine(ArrayList<Fruit> mace)
    {
        macedoine = new ArrayList<Fruit>();
        macedoine.addAll(mace);
    }
    
    public double getPrix(){
        prix = 0;
	for(Fruit f : macedoine){
            prix += f.getPrix();
        }
        return prix;
    }

    public void setPrix(double prix){
	for(Fruit f : macedoine){
            prix += f.getPrix();
        }
    }
    
    @Override
    public boolean isSeedless() {
        boolean seed = false;
        for(Fruit f : macedoine){
            if(!f.isSeedless()){
                seed = true;
            }
        }
        return seed;
    }

    @Override
    public String getOrigine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString()
    {
        String s = "La macedoine contient : ";
        for(Fruit f : macedoine){
            s += f.getNom()+" ";
        }
        return s +"a "+getPrix();
    }
    
        @Override
    public boolean equals(Object o)
    {  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass())
        {
            Macedoine m = (Macedoine) o;
            return (prix == m.prix);
        }
        
        return false;
    }

    @Override
    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
