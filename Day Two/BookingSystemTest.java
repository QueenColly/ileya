import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BookingSystemTest  {

    @Test //1
        public void testThatSuggestBooksReturnBooksIsEmpty_ifNoBookExists(){

    
            BookingSystem booking = new BookingSystem();
            booking.books.clear();

            String actual = booking.suggestBooks();

            System.out.println(actual);

            String expected = "Books is empty";

            assertEquals( expected, actual);
}

     @Test //2
        public void testThatIAddBook(){

    
            BookingSystem booking = new BookingSystem();
            booking.books.clear();

            String bookName = "Things fall apart";
            String actual = booking.addBooks(bookName);

            System.out.println(actual);

            String expected = "Things fall apart added successfully";

            assertEquals( expected, actual);
}

     @Test //3
        public void testThatBookIsRemoved(){

    
            BookingSystem booking = new BookingSystem();
            String bookName = "Things fall apart";

            booking.addBooks(bookName);

            String actual = booking.removeBooks(bookName);

            System.out.println(actual);

            String expected = "Book has been successfully removed" ;

            assertEquals( expected, actual);
}

      
     @Test //4
        public void testThatABookIsUpdated_afterAddingABook(){

    
            BookingSystem booking = new BookingSystem();
            booking.books.clear();

            String oldBook= "Things fall apart";
            booking.addBooks(oldBook);

            String newBook = "Game of thrones";
            String actual = booking.updateBooks(oldBook, newBook);
        

            System.out.println(actual);

            String expected = "Book has been updated";

            assertEquals( expected, actual);
}

      @Test //5
        public void testThatAllBooksAreDisplayedOnTheShelf(){

    
             BookingSystem booking = new BookingSystem();
            booking.books.clear();

            String []actual = booking.showAllBooks();

            System.out.println(actual);

            String[] expected = {};

            assertArrayEquals( expected, actual);
}

       @Test //6
        public void testThatSuggestBooksReturnBooksIsNotEmpty_ifBookExists(){


            BookingSystem booking = new BookingSystem();
            booking.books.clear();

            String bookName1 = "Things fall apart";
            String book1 = booking.addBooks(bookName1);
            System.out.println(book1);

            String bookName2 = "Ages past";
            String book2  = booking.addBooks(bookName2);
            System.out.println(book2);
    
            String actual = booking.suggestBooks();

            System.out.println("suggested book : " +actual);

            
            String expected = "Books is empty";

            assertNotEquals( expected, actual);
}

}
