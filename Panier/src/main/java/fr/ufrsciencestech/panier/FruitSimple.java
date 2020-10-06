/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author aa690491
 */
public abstract class FruitSimple implements Fruit
{
    private double prix;
    private String origine;
    
    public abstract boolean isSeedless();
    
    public double getPrix()
    {
        return this.prix;
    }
   
    public String getOrigine()
    {
        return this.origine;
    }
    
    public void setPrix(double prix)
    {
        this.prix = prix;
    }
    
    public void setOrigine(String origine)
    {
        this.origine = origine;
    }
    

    
    public abstract boolean equals(Object o);
    
    public abstract String toString();
    
    abstract FruitSimple createFruit(double prix, String origine);
    abstract FruitSimple createFruitNull();
}
