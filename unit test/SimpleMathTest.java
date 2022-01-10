/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class SimpleMathTest {
    
    public SimpleMathTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void twoPlusSix() throws Exception {
        final long result = new SimpleMath().add(2, 6);
        assertThat(result, is(8L));
    }
     
     
    @Test
    public void fivePlustwo() throws Exception {
        final long result = new SimpleMath().add(5, 2);
        assertThat(result, is(7L));
    }
    
    
    @Test
    public void threeMinusOne() throws Exception {
        final long result = new SimpleMath().subtract(3, 1);
        assertThat(result, is(2L));
    }
 @Test
    public void twoMultiplyTwo() throws Exception {
        final long result = new SimpleMath().multiply(2, 2);
        assertThat(result, is(4L));
    }
     @Test
    public void fourDivideTwo() throws Exception {
        final long result = new SimpleMath().divide(4, 2);
        assertThat(result, is(2L));
    }
}
