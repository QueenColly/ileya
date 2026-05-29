import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

    public class NumberArraysTwoTest{

    @Test
     public void testThatArrayIsDuplicate(){
        //givin
        int[] given = {1,2,3,2,4,3};

        //actual
        NumberArraysTwo  function = new NumberArraysTwo ();
        int [] actual = function.getDuplicates(given);
         
        //expected
        int [] result = {2,3};

        assertArrayEquals(actual, result);

}
}
