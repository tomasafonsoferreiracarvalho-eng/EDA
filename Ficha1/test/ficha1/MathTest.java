/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha1;

import java.math.BigInteger;
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
public class MathTest {
    
    public MathTest() {
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
     * Test of factorialI method, of class Math.
     */
    @Test
    public void testFactorialI() {
        System.out.println("factorialI");
        // int num = 0;
        // int expResult = 0;
        // long result = Math.factorialI(num);
        // assertEquals(expResult, result);
        assertEquals(1, Math.factorialI(1));
        assertEquals(2, Math.factorialI(2));
        assertEquals(3, Math.factorialI(3));
        assertEquals(4, Math.factorialI(4));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorialR method, of class Math.
     */
    @Test
    public void testFactorialR() {
        System.out.println("factorialR");
        // int num = 0;
        // int expResult = 0;
        // long result = Math.factorialR(num);
        // assertEquals(expResult, result);
        assertEquals(1, Math.factorialR(1));
        assertEquals(2, Math.factorialR(2));
        assertEquals(3, Math.factorialR(3));
        assertEquals(4, Math.factorialR(4));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFactorialBigI() {
        System.out.println("factorialBigInteger");
        // int num = 0;
        // int expResult = 0;
        // BigInteger result = Math.factorialBigI(num);
        // assertEquals(expResult, result);
        assertEquals(BigInteger.valueOf(1), Math.factorialBigI(1));
        assertEquals(BigInteger.valueOf(2), Math.factorialBigI(2));
        assertEquals(BigInteger.valueOf(3), Math.factorialBigI(3));
        assertEquals(BigInteger.valueOf(4), Math.factorialBigI(4));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testFactorialBigR() {
        System.out.println("factorialBigInteger");
        // int num = 0;
        // int expResult = 0;
        // BigInteger result = Math.factorialBigR(num);
        // assertEquals(expResult, result);
        assertEquals(BigInteger.valueOf(1), Math.factorialBigR(1));
        assertEquals(BigInteger.valueOf(2), Math.factorialBigR(2));
        assertEquals(BigInteger.valueOf(3), Math.factorialBigR(3));
        assertEquals(BigInteger.valueOf(4), Math.factorialBigR(4));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
