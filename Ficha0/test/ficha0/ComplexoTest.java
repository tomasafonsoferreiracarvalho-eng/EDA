/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha0;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomas
 */
public class ComplexoTest {
    
    public ComplexoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    System.out.println("Start");
    }
    
    @After
    public void tearDown() {
        System.out.println("End");
    }

    /**
     * Test of setParteReal method, of class Complexo.
     */
    @Test
    public void testSetParteReal() {
        System.out.println("setParteReal");
        double c = 0.0;
        Complexo instance = new Complexo();
        instance.setParteReal(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParteImaginaria method, of class Complexo.
     */
    @Test
    public void testSetParteImaginaria() {
        System.out.println("setParteImaginaria");
        double d = 0.0;
        Complexo instance = new Complexo();
        instance.setParteImaginaria(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParteReal method, of class Complexo.
     */
    @Test
    public void testGetParteReal() {
        System.out.println("getParteReal");
        Complexo instance = new Complexo();
        double expResult = 0.0;
        double result = instance.getParteReal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParteImaginaria method, of class Complexo.
     */
    @Test
    public void testGetParteImaginaria() {
        System.out.println("getParteImaginaria");
        assertEquals(2, new Complexo(2,3).getParteReal(), 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of somar method, of class Complexo.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.somar(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtrair method, of class Complexo.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.subtrair(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Complexo.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.multiplicar(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Complexo.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.dividir(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conjugado method, of class Complexo.
     */
    @Test
    public void testConjugado() {
        System.out.println("conjugado");
        Complexo c = null;
        Complexo expResult = null;
        Complexo result = Complexo.conjugado(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Complexo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Complexo instance = new Complexo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Complexo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Complexo instance = new Complexo();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Complexo.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Complexo instance = new Complexo();
        Object expResult = null;
        Object result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
