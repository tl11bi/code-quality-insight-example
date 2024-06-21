package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void regularTriangle(){
        assertTrue(App.isTriangle(3,4,5));
    }

    @Test
    public void regularTriangle2(){
        assertTrue(App.isTriangle(4,5,3));
    }

    @Test
    public void regularTriangle3(){
        assertTrue(App.isTriangle(8,11,12));
    }

    @Test
    public void sumOfTwoSidesIsLessThanThirdSide(){
        assertFalse(App.isTriangle(1,3,4));
    }

    @Test
    public void aMinusBisC(){
        assertFalse(App.isTriangle(5,1,4));
    }


    @Test
    public void checkOneZero(){
        assertFalse(App.isTriangle(2,0,4));
    }

    @Test
    public void checkTwoZeroes(){
        assertFalse(App.isTriangle(0,0,15));
    }

    @Test
    public void checkThreeZeroes(){
        assertFalse(App.isTriangle(0,0,0));
    }

    @Test
    public void checkNegativeNumber(){
        assertFalse(App.isTriangle(-1,3,4));
    }

    @Test
    public void checkNegativeNumber2(){
        assertFalse(App.isTriangle(3,-3,0));
    }

    @Test
    public void checkNegativeNumber3(){
        assertFalse(App.isTriangle(+3,+3,-6));
    }

    @Test
    public void sumEqualsLength(){
        assertFalse(App.isTriangle(1,2,3));
    }

    @Test
    public void sumEqualsLength2(){
        assertFalse(App.isTriangle(1,1,2));
    }

    @Test
    public void testRightTriangle(){
        assertTrue(App.isTriangle(2,2,2));
    }


    @Test
    public void checkPlus(){
        assertTrue(App.isTriangle(+5,+3,+4));
    }

    @Test
    public void checkEmpty(){
        assertFalse(App.isTriangle('\n',3,'!'));
    }
    
    @Test
    public void unitTestShouldAnswerWithTrue()
    {

        assertTrue( true );
        System.out.println("Unit test passed!");
    }
}
