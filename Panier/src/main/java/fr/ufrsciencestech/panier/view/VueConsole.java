/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.view;

import fr.ufrsciencestech.panier.model.Panier;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author aa690491
 */
public class VueConsole implements Observer{
    private String trace;
    
    /**
     * @return the trace
     */
    public String getTrace() {
        return trace;
    }

    /**
     * @param trace the trace to set
     */
    public void setTrace(String trace) {
        this.trace = trace;
    }
    
    public VueConsole(){
        trace = "Pas encore d'orange ajoutée.";
        System.out.println(trace);
    }
    
    public void update(Observable m, Object panier){   //This method is called whenever the observed object is changed
        trace = (Integer.toString(((Panier) panier).getTaillePanier()));
        System.out.println(trace);
    }
}
