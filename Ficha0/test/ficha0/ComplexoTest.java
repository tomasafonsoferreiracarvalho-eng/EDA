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
        double c = 5.0;
        Complexo instance = new Complexo();
        instance.setParteReal(c);
        assertEquals(5.0, instance.getParteReal(), 0);
    }

    /**
     * Test of setParteImaginaria method, of class Complexo.
     */
    @Test
    public void testSetParteImaginaria() {
        System.out.println("setParteImaginaria");
        double d = 3.0;
        Complexo instance = new Complexo();
        instance.setParteImaginaria(d);
        assertEquals(3.0, instance.getParteImaginaria(), 0);
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
    }

    /**
     * Test of getParteImaginaria method, of class Complexo.
     */
    @Test
    public void testGetParteImaginaria() {
        System.out.println("getParteImaginaria");
        Complexo instance = new Complexo(2, 3);
        double expResult = 3.0;
        double result = instance.getParteImaginaria();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of somar method, of class Complexo.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        Complexo c1 = new Complexo(1, 2);
        Complexo c2 = new Complexo(3, 4);
        Complexo expResult = new Complexo(4, 6);
        Complexo result = Complexo.somar(c1, c2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtrair method, of class Complexo.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        Complexo c1 = new Complexo(5, 3);
        Complexo c2 = new Complexo(2, 1);
        Complexo expResult = new Complexo(3, 2);
        Complexo result = Complexo.subtrair(c1, c2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class Complexo.
     * (1+2i)*(3+4i) = (1*3 - 2*4) + (1*4 + 2*3)i = -5 + 10i
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Complexo c1 = new Complexo(1, 2);
        Complexo c2 = new Complexo(3, 4);
        Complexo expResult = new Complexo(-5, 10);
        Complexo result = Complexo.multiplicar(c1, c2);
        assertEquals(expResult, result);
    }

    /**
     * Test of dividir method, of class Complexo.
     * (1+2i)/(3+4i) = ((1*3+2*4) + (2*3-1*4)i) / (3^2+4^2) = (11+2i)/25 = 0.44+0.08i
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Complexo c1 = new Complexo(1, 2);
        Complexo c2 = new Complexo(3, 4);
        Complexo expResult = new Complexo(0.44, 0.08);
        Complexo result = Complexo.dividir(c1, c2);
        assertEquals(expResult, result);
    }

    /**
     * Test of conjugado method, of class Complexo.
     */
    @Test
    public void testConjugado() {
        System.out.println("conjugado");
        Complexo c = new Complexo(2, 3);
        Complexo expResult = new Complexo(2, -3);
        Complexo result = Complexo.conjugado(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Complexo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Complexo positivo = new Complexo(2, 3);
        assertEquals("2.0+3.0i", positivo.toString());

        Complexo negativo = new Complexo(2, -3);
        assertEquals("2.0-3.0i", negativo.toString());
    }

    /**
     * Test of equals method, of class Complexo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Complexo instance = new Complexo(2, 3);
        Complexo igual = new Complexo(2, 3);
        Complexo diferente = new Complexo(2, 4);

        assertTrue(instance.equals(igual));
        assertFalse(instance.equals(diferente));
        assertFalse(instance.equals(null));
        assertFalse(instance.equals("string qualquer"));
    }

    /**
     * Test of clone method, of class Complexo.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Complexo instance = new Complexo(2, 3);
        Object result = instance.clone();

        assertNotSame(instance, result);
        assertEquals(instance, result);
    }

}