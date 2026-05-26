import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class NumberArraysTest{

    @Test
     public static void testThatArrayIsOdd(){
        //givin
        int[] given = {45,60,3,10,9,22};

        //actual
        ArrayFunctions function = new ArrayFunctions();
        int [] actual = function.getPrimes(given);
         
        //expected
        int [] result = {45,3,9};

        assertArrayEquals(actual, result);

}

}

