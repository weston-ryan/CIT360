/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author westo
 */
public class VectorsCIT360JUnitTest {
    
    public VectorsCIT360JUnitTest() {
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
     * Test of equal method, of class Vectors.
     * all True tests must be true
     * all false tests must be false
     */
    @Test
    public void testEqual() {
        System.out.println("* VectorsCIT360JUnitTest: testEqual()");
        
    assertTrue(Vectors.equal(new int[] {}, new int[] {}));
    assertTrue(Vectors.equal(new int[] {0}, new int[] {0}));
    assertTrue(Vectors.equal(new int[] {0, 0}, new int[] {0, 0}));
    assertTrue(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0, 0}));
    assertTrue(Vectors.equal(new int[] {5, 6, 7}, new int[] {5, 6, 7}));

    assertFalse(Vectors.equal(new int[] {}, new int[] {0}));
    assertFalse(Vectors.equal(new int[] {0}, new int[] {0, 0}));
    assertFalse(Vectors.equal(new int[] {0, 0}, new int[] {0, 0, 0}));
    assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0}));
    assertFalse(Vectors.equal(new int[] {0, 0}, new int[] {0}));
    assertFalse(Vectors.equal(new int[] {0}, new int[] {}));

    assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0, 1}));
    assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 1, 0}));
    assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {1, 0, 0}));
    assertFalse(Vectors.equal(new int[] {0, 0, 1}, new int[] {0, 0, 3}));
}
    

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("* VectorsCIT360JUnitTest: scalarMultiplication()");
    assertEquals(  0, Vectors.scalarMultiplication(new int[] { 0, 0}, new int[] { 0, 0}));
    assertEquals( 39, Vectors.scalarMultiplication(new int[] { 3, 4}, new int[] { 5, 6}));
    assertEquals(-39, Vectors.scalarMultiplication(new int[] {-3, 4}, new int[] { 5,-6}));
    assertEquals(  0, Vectors.scalarMultiplication(new int[] { 5, 9}, new int[] {-9, 5}));
    assertEquals(100, Vectors.scalarMultiplication(new int[] { 6, 8}, new int[] { 6, 8}));
    }
        @Test
    //public void testConcatWords() {
       public void testHelloWorld() {
    System.out.println("* UtilsCIT360JUnitTest: test method 1 - testHelloWorld()");
    assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
}

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testWithTimeout() throws InterruptedException, TimeoutException {
    System.out.println("* UtilsCIT360JUnitTest: test method 2 - testWithTimeout()");    
    final int factorialOf = 1 + (int) (30000 * Math.random());
    System.out.println("computing " + factorialOf + '!');

    Thread testThread = new Thread() {
        @Override
        public void run() {
            System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
        }
    };
        testThread.start();
    Thread.sleep(1000);
    testThread.interrupt();

    if (testThread.isInterrupted()) {
        throw new TimeoutException("the test took too long to complete");
    }
}
    public void testExpectedException() {
        System.out.println("* UtilsCIT360JUnitTest: test method 3 - testExpectedException()");
    try {
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
        fail("IllegalArgumentException was expected");
    } catch (IllegalArgumentException ex) {
    }
}

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
public void DISABLED_testTemporarilyDisabled() throws Exception {
    System.out.println("* UtilsJUnit3Test: test method 4 - checkExpectedException()");
    assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
}
   @Test
   public void testAssertions() {
      //test data
      String str1 = new String ("abc");
      String str2 = new String ("abc");
      String str3 = null;
      String str4 = "abc";
      String str5 = "abc";
		
      int val1 = 5;
      int val2 = 6;

      String[] expectedArray = {"one", "two", "three"};
      String[] resultArray =  {"one", "two", "three"};
      //Check that two objects are equal
      assertEquals(str1, str2);

      //Check that a condition is true
      assertTrue (val1 < val2);

      //Check that a condition is false
      assertFalse(val1 > val2);

      //Check that an object isn't null
      assertNotNull(str1);

      //Check that an object is null
      assertNull(str3);

      //Check if two object references point to the same object
      assertSame(str4,str5);

      //Check if two object references not point to the same object
      assertNotSame(str1,str3);

      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }
}
