/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.view;

import fr.ufrsciencestech.panier.model.Panier;
import fr.ufrsciencestech.panier.controler.Controleur;
import java.awt.BorderLayout;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author aa690491
 */
public class VueGraphSwing extends JFrame implements VueG
{
    private JButton inc;
    private JButton dec;
    private JLabel affiche;
    
    public VueGraphSwing()
    {
        super("Panier");
        inc = new JButton("+");
        dec = new JButton("-");
        affiche = new JLabel("", JLabel.CENTER);
        add(inc, BorderLayout.NORTH);
        add(dec, BorderLayout.SOUTH);
        add(affiche, BorderLayout.CENTER);
        
        inc.setName("Plus");
        dec.setName("Moins");
        affiche.setName("Affichage");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void addControleur(Controleur c)
    {
        getInc().addActionListener(c);
        getDec().addActionListener(c);
    }
    
    @Override
    public void update(Observable m, Object obj){     //This method is called whenever the observed object is changed
        
        if(obj == null)
        {
            getAffiche().setText("Pas de panier.");
        }
        else
        {
            Panier panier = (Panier)obj;
            if(panier.estVide())
            {
                getAffiche().setText("Le panier est vide.");
            }
            else
            {
                getAffiche().setText(Integer.toString(panier.getTaillePanier()));
            }
        }
    }

    /**
     * @return the inc
     */
    public JButton getInc() {
        return inc;
    }

    /**
     * @param inc the inc to set
     */
    public void setInc(JButton inc) {
        this.inc = inc;
    }

    /**
     * @return the dec
     */
    public JButton getDec() {
        return dec;
    }

    /**
     * @param dec the dec to set
     */
    public void setDec(JButton dec) {
        this.dec = dec;
    }

    /**
     * @return the affiche
     */
    public JLabel getAffiche() {
        return affiche;
    }

    /**
     * @param affiche the affiche to set
     */
    public void setAffiche(JLabel affiche)
    {
        this.affiche = affiche;
    }
}
