import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

    public class NumberArraysTest{

    @Test
     public void testThatArrayIsOdd(){
        //givin
        int[] given = {45,60,3,10,9,22};

        //actual
        NumberArrays  function = new NumberArrays ();
        int [] actual = function.getOdd(given);
         
        //expected
        int [] result = {45,3,9};

        assertArrayEquals(actual, result);

}

           @Test
     public void testThatArrayIsEven(){
        //givin
        int[] given = {45,60,3,10,9,22};

        //actual
        NumberArrays function = new NumberArrays ();
        int [] actual = function.getEven(given);
         
        //expected
        int [] result = {60,10,22};

        assertArrayEquals(actual, result);

}


    @Test
    public void testPalindromeArray() {

        int[] numbers = {45,0,8,0,45};
        NumberArrays  function = new NumberArrays ();

        assertTrue(function.getPalindrome(numbers));
    }

    @Test
    public void testNotPalindromeArray() {

        int[] numbers = {1, 2, 3, 4};
        NumberArrays  function = new NumberArrays ();
        System.out.println(function.getPalindrome(numbers));
        assertFalse(function.getPalindrome(numbers));
    }

        
           @Test
     public void testThatArrayIsPerfectSquare(){
        //givin
        int[] given = {4,7,9,10,16,18};

        //actual
        NumberArrays function = new NumberArrays();
        int [] actual = function.getPerfectSquare(given);
         
        //expected
        int [] result = {4,9,16};

        assertArrayEquals(actual, result);

    }

                @Test
     public void testThatArrayIsNotPerfectSquare(){
        //givin
        int[] given = {4,7,9,10,49,6};

        //actual
        NumberArrays function = new NumberArrays();
        int [] actual = function.getNonPerfectSquare(given);
         
        //expected
        int [] result = {4,-1,9,-1,49,-1};

        assertArrayEquals(actual, result);

    }

}

