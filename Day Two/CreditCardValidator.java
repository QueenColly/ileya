import java.util.Scanner;
public class CreditCardValidator {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter card details to verify: ");
    String card = scan.nextLine();


//    System.out.println("Credit Card Type: " + getCreditCardType(card));
//    System.out.println("Credit Card Number: " + card);
//    System.out.println("Credit Card Digit Length: " + creditCardLength(card));
//    int sum = sumOfOddAndEven(card);
//    System.out.println("Credit Card Validity Status: " + checkCardCredibility(sum));

    int sum = calculateEvenPositions(card);
    System.out.print("Sum: "+sum);
    


}


     public static String getCreditCardType(String creditCardNumber){
         String cardType = "";
         if (creditCardNumber.charAt(0) == ('4')) {
             cardType = "Visa card";
         }
         else if (creditCardNumber.charAt(0) == ('5')) {
             cardType = "Master card";
         }
         else if (creditCardNumber.charAt(0) == ('3') && creditCardNumber.charAt(1) == ('7')) {
             cardType = "American express card";
         }
         else if (creditCardNumber.charAt(0) == ('6')){
             cardType = "Discover card";
         }

         return cardType;
     }

     public static int creditCardLength(String creditCardNumber){
         return creditCardNumber.length();
     }

    public static int[] passNumbersIntoArrayAsInt(String creditCardNumber) {
        int []array = new int[creditCardNumber.length()];

        long cardNumber = Long.parseLong(creditCardNumber);

        int count = 0;
        for (int index = creditCardNumber.length() -1 ; index >= 0 ; index--){

            array[count] = (int) (cardNumber % 10);
            cardNumber = cardNumber / 10;
            count++;
        }
        return array;
    }


    public static int calculateOddPositions(String creditCardNumber){
        int[] array = passNumbersIntoArrayAsInt(creditCardNumber);

        int sum = 0;
         int multiplier = 0;
         for (int index = 0; index < array.length; index++){
             if (index % 2 != 0){
                 multiplier = array[index] * 2;
                 if (multiplier > 9){
                     sum = sum + ((multiplier / 10) + (multiplier % 10));

                 }
                 else {
                     sum = sum + multiplier;
                 }
             }
             multiplier = 0;
         }

         return sum;
    }

    public static int calculateEvenPositions(String creditcardNumber){
            int[] array = passNumbersIntoArrayAsInt(creditcardNumber);

            int sum = 0;

            for(int index =0;index < array.length;index++){
                if(index % 2 == 0){
                    sum = sum + array[index];
    
                }
   
            }
                return sum;
    }

    public static int sumOfOddAndEven (String creditcardNumber){
         int addition = calculateEvenPositions(creditcardNumber) + calculateOddPositions(creditcardNumber);
         return addition;
    }

    public static String checkCardCredibility (int sumOfOddAndEven) {
        if (sumOfOddAndEven % 10 == 0) {
            return "valid";
        }
        return "invalid";
    }

}
