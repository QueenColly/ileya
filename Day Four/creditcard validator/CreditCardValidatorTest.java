import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreditCardValidatorTest{

        @Test
            public void testThatCreditCardTypeExists() {
            
            CreditCardValidator  credit = new CreditCardValidator();
            String creditCardNumber = "4187451822753663";
            String  actual = credit.getCreditCardType(creditCardNumber);
            String expected = "Visa card";

            assertEquals( expected, actual);
    }

        @Test
            public void testThatCreditCardLengthIs_SixteenIn_Length() {
            
            CreditCardValidator  credit = new CreditCardValidator();

            String creditCardNumber = "4187451822753663";
            
            
            int actual = credit.creditCardLength(creditCardNumber);

            assertEquals(16, actual);     

}

        @Test
            public void testThatCreditCardIsReversed() {
            
            CreditCardValidator  credit = new CreditCardValidator();

            String creditCardNumber = "4187451822753663";

            
            int[] actual = credit.passNumbersIntoArrayAsInt(creditCardNumber);
            int []expected = {3,6,6,3,5,7,2,2,8,1,5,4,7,8,1,4};

            assertArrayEquals(expected, actual);     

}

        @Test
            public void testThatCreditCardNumbers_AreSingle_Handedly_Checked_For_Odd_Positions(){
            
             CreditCardValidator  credit = new CreditCardValidator();

             String creditCardNumber = "4187451822753663";
             int actual = credit.calculateOddPositions(creditCardNumber);
             int expected = 43; 

              assertEquals(expected, actual); 

}

          @Test
            public void testThatCreditCardNumbers_AreSingle_Handedly_Checked_For_Even_Positions(){
            
             CreditCardValidator  credit = new CreditCardValidator();

             String creditCardNumber = "4187451822753663";
             int actual = credit.calculateEvenPositions(creditCardNumber);
             int expected = 37; 

              assertEquals(expected, actual); 

}
           @Test
            public void testThatSumOfEvenAndOddAreApplicable(){
            
             CreditCardValidator  credit = new CreditCardValidator();

             String creditCardNumber = "4187451822753663";
             int actual = credit.sumOfOddAndEven(creditCardNumber);
             int expected = 80; 

              assertEquals(expected, actual); 

}

          @Test
            public void testThatSCardIsDivisibleByTen(){
            
             CreditCardValidator  credit = new CreditCardValidator();

             String creditCardNumber = "4187451822753663";
             int sum = credit.sumOfOddAndEven(creditCardNumber);

             String actual = credit.checkCardCredibility(sum);
             String expected = "Valid"; 

              assertEquals(expected, actual); 

}
}
