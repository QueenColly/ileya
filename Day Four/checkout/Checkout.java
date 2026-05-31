import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    static ArrayList<String> productNames = new ArrayList<>();
    static ArrayList<Integer> quantities = new ArrayList<>();
    static ArrayList<Double> prices = new ArrayList<>();
    static ArrayList<Double> itemTotals = new ArrayList<>();

    static double subTotal = 0.0;
    static double discountAmount = 0.0;
    static double vatAmount = 0.0;
    static double billTotal = 0.0;
    static double VAT_RATE = 17.50 / 100;

    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        String value = "yes";

        System.out.println ("Welcome to Semicolon Super Stores!!!... ");

        System.out.print("What is the customer's name? ");
        String customersName = input.nextLine();

        while (value.equalsIgnoreCase("yes")) {
            System.out.print("What did the user buy? ");
            String name = input.next();

            System.out.print("How many pieces? ");
            int quantity = input.nextInt();

            System.out.print("How much per unit? ");
            double price = input.nextDouble();

            String productToAdd = addProductToCart(name, quantity, price);
            System.out.println(productToAdd);

            System.out.print("Add more Items? (yes/no): ");
            value = input.next();

            input.nextLine();

}
        
        System.out.print("\nWhat is your name (Cashier)? ");
        String cashiersName = input.nextLine();

        System.out.println("How much discount will " + customersName + "get? ");
        int discountRate = input.nextInt();

        calaculateTotals(discountRate);

        System.out.printf("%45s%.2f%n", "Sub Total: ", subTotal);
        System.out.printf("%45s%.2f%n", "Discount: ", discountAmount);
        System.out.printf("%45s%.2f%n", "VAT @ 17.50%: ", vatAmount);
        System.out.println("=========================================================");
        System.out.printf("%45s%.2f%n", "Bill Total: ", billTotal);
        System.out.println("=========================================================");
        System.out.printf("%45s%.2f%n", "THIS IS NOT A RECEIPT KINDLY PAY: ", billTotal);
        System.out.println("=========================================================\n");
        

        for (int index = 0; index < productNames.size(); index++) {
            System.out.printf("%20s %9d %10.2f %14.2f %n", productNames.get(index), quantities.get(index), prices.get(index), itemTotals.get(index)
            );
        }
        System.out.println("---------------------------------------------------------");

        System.out.printf("%45s%.2f%n", "Sub Total: ", subTotal);
        System.out.printf("%45s%.2f%n", "Discount: ", discountAmount);
        System.out.printf("%45s%.2f%n", "VAT @ 17.50%: ", vatAmount);
        System.out.println("=========================================================");
        System.out.printf("%45s%.2f%n", "Bill Total: ", billTotal);
        System.out.println("=========================================================");
        System.out.printf("%45s%.2f%n", "THIS IS NOT A RECEIPT KINDLY PAY: ", billTotal);
        System.out.println("=========================================================\n");


        System.out.println("\nHow much did the customer give to you? ");
        double deposit = input.nextDouble();

        while(deposit < billTotal) {
            System.out.print("Invalid amount value, enter a valid amount please: ");
            deposit = input.nextDouble();
        }

        double balance = deposit - billTotal;

        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("DATE: 18-AUGUST-24  8:48:11pm");
        System.out.println("Cashier: " + cashiersName);
        System.out.println("Customer Name: " + customersName);
        System.out.println("=========================================================");
        System.out.printf("%20s%10s%10s%15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------------");

        for (int index = 0; index < productNames.size(); index++) {
            System.out.printf("%20s %9d %10.2f %14.2f %n", productNames.get(index), quantities.get(index), prices.get(index), itemTotals.get(index)
            );
        }
        System.out.println("---------------------------------------------------------");

        System.out.printf("%45s%.2f%n", "Sub Total: ", subTotal);
        System.out.printf("%45s%.2f%n", "Discount: ", discountAmount);
        System.out.printf("%45s%.2f%n", "VAT @ 17.50%: ", vatAmount);
        System.out.println("=========================================================");
        System.out.printf("%45s%.2f%n", "Bill Total: ", billTotal);
        System.out.printf("%45s%.2f%n", "Amount Paid: ", deposit);
        System.out.printf("%45s%.2f%n", "Balance: ", balance);
        System.out.println("=========================================================");
        System.out.println("            THANK YOU FOR YOUR PATRONAGE          ");
        System.out.println("=========================================================\n");
   
}
    public static String addProductToCart(String productName, int quantity, double price) {

        if(productName.equals("")){
            return "add product name";
        }
        if(quantity == 0){
            return "add quantity";
}

         if(price == 0){
            return "add price";
}


        productNames.add(productName);
        quantities.add(quantity);
        prices.add(price);

        double totalForItem = quantity * price;
        itemTotals.add(totalForItem);
        
        System.out.println();
        return productName + " added successfully";
}

    public static void calaculateTotals(int discountRate) {
        double rate = (double) discountRate / 100;

        subTotal = 0;
        for (int index = 0; index < itemTotals.size(); index++) {
            subTotal += itemTotals.get(index);
        }

        discountAmount = rate * subTotal;
        vatAmount = VAT_RATE * subTotal;

        billTotal = (subTotal - discountAmount) + vatAmount;
}

    
}

