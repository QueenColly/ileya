import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


    public class CheckoutTest {

        @Test
        public void testThatProductIsAdded_To_cart() {
        
        Checkout check = new Checkout();

        String productName = "milo";
        int quantity = 20;
        double price = 1000;
        String  actual = check.addProductToCart(productName, quantity, price);

        String expected = "milo added successfully";
        assertEquals (actual, expected);
}

         @Test
        public void testThatNoProductIsAdded_To_cart() {
        
        Checkout check = new Checkout();

        String productName = "";
        int quantity = 20;
        double price = 1000;
        String  actual = check.addProductToCart(productName, quantity, price);

        String expected = "add product name";
        assertEquals (actual, expected);
} 

           @Test
        public void testThatNoQuantityIsAdded_To_cart() {
        
        Checkout check = new Checkout();

        String productName = "Dano";
        int quantity = 0;
        double price = 1000;
        String  actual = check.addProductToCart(productName, quantity, price);

        String expected = "add quantity";
        assertEquals (actual, expected);
}          

            @Test
        public void testThatNoPriceIsAdded_To_cart() {
        
        Checkout check = new Checkout();

        String productName = "Dano";
        int quantity = 40;
        double price = 0;
        String  actual = check.addProductToCart(productName, quantity, price);

        String expected = "add price";
        assertEquals (actual, expected);
}       
   
}
