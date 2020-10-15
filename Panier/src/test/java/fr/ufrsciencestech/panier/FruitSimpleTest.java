/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aa690491
 */
public class FruitSimpleTest {
    
    public FruitSimpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isSeedless method, of class FruitSimple.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        FruitSimple instance = new FruitSimpleImpl();
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class FruitSimple.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        FruitSimple instance = new FruitSimpleImpl();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class FruitSimple.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        FruitSimple instance = new FruitSimpleImpl();
        
        double expResult, result;
        
        //Test si prix négatif
        instance.setPrix(-5);
        expResult = 5;
        result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        
        
        //Test si prix nul
        instance.setPrix(0);
        expResult = 0;
        result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        
        //Test si prix positif
        instance.setPrix(5);
        expResult = 5;
        result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class FruitSimple.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        FruitSimple instance = new FruitSimpleImpl();
        
        String expResult;
        String result;
                
        //Test si origine vide
        instance.setOrigine("");
        expResult = "Origine inconnue";
        result = instance.getOrigine();
        assertEquals(expResult, result);
        
        //Test si origine donnée
        instance.setOrigine("truc");
        expResult = "truc";
        result = instance.getOrigine();
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class FruitSimple.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.0;
        FruitSimple instance = new FruitSimpleImpl();
        instance.setPrix(prix);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigine method, of class FruitSimple.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "";
        FruitSimple instance = new FruitSimpleImpl();
        instance.setOrigine(origine);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class FruitSimple.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object arg0 = null;
        FruitSimple instance = new FruitSimpleImpl();
        boolean expResult = false;
        boolean result = instance.equals(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FruitSimple.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FruitSimple instance = new FruitSimpleImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createFruit method, of class FruitSimple.
     */
    @Test
    public void testCreateFruit() {
        System.out.println("createFruit");
        double arg0 = 0.0;
        String arg1 = "";
        FruitSimple instance = new FruitSimpleImpl();
        FruitSimple expResult = null;
        FruitSimple result = instance.createFruit(arg0, arg1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createFruitNull method, of class FruitSimple.
     */
    @Test
    public void testCreateFruitNull() {
        System.out.println("createFruitNull");
        FruitSimple instance = new FruitSimpleImpl();
        FruitSimple expResult = null;
        FruitSimple result = instance.createFruitNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class FruitSimpleImpl extends FruitSimple {

        public boolean isSeedless() {
            return false;
        }

        public String getNom() {
            return "";
        }

        public boolean equals(Object arg0) {
            return false;
        }

        public String toString() {
            return "";
        }

        public FruitSimple createFruit(double arg0, String arg1) {
            return null;
        }

        public FruitSimple createFruitNull() {
            return null;
        }
    }
    
}
