/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.controler;

import fr.ufrsciencestech.panier.model.Panier;
import fr.ufrsciencestech.panier.view.VueG;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aa690491
 */
public class Controleur implements ActionListener {
    private Panier modele;
    private VueG vg;
    
    @Override
    public void actionPerformed(ActionEvent e){   //Invoked when an action occurs
        if(((Component)e.getSource()).getName().equals("Plus")) 
            modele.update(1);
        else
            modele.update(-1);
    }
    public void setModele(Panier modele){
        this.modele = modele;
    }
    public void setVue(VueG vg){
        this.vg = vg;
    }
    
    /*public void setPanier(Panier panier)
    {
        this.panier = panier;
    }
    
    public Panier getPanier()
    {
        return this.panier;
    }*/
}