import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;


public class BookingSystem{
      static ArrayList <String> books = new ArrayList<>();

public static void main(String [] args){

  
    Scanner input = new Scanner(System.in);

    String Menu = """

        Welcome to the Book Suggestion System!

            1. Get suggestions
            2. Add Book
            3. Remove Book
            4. Update book
            5. Show all books

                """;

        System.out.println(Menu);
        System.out.print("Enter operation: ");
        String userInput = input.nextLine();

        switch (userInput) {

        case "1" -> {
            System.out.println("Book for the Day: ");
            String suggestedBook = suggestBooks();
            System.out.println(suggestedBook);    
       }
        
       }
}
        //1
    public static String suggestBooks(){
        int firstPage = 1;
        int lastPage = 101;

    Random random = new Random();
    if(books.size() < 1){
        return "Books is empty";
    }
    
    int randomBookPage = random.nextInt(firstPage, lastPage);
    String randomBookName = books.get(random.nextInt(books.size()));

    return "The book page is: " + randomBookPage + " and the book name is: " + randomBookName;
        
}
     //2
    public static String addBooks(String bookName){
        

        if(books.contains(bookName)){
           return "Book already exists ";
}

            books.add(bookName);

        return bookName +" added successfully";
}   
        //3
    public static String removeBooks(String bookName){
        
        for(int index = 0 ; index <= books.size()-1; index++){
            if(books.get(index).equals(bookName)){
              books.remove(index) ;

}
       }
        return "Book has been successfully removed";
}
        //4
    public static String updateBooks(String oldBook, String newBook){
        
        for(int index = 0; index <= books.size()-1; index++){
            if(books.get(index).equals(oldBook)){
                books.remove(index); 
                books.add(newBook) ;      
        }

}
            return "Book has been updated";
}
        //5
    public static String[] showAllBooks(){
    
    String[] arrays = new String[books.size()];

       
    for(int index = 0; index <= books.size()-1; index++){
      arrays[index] = books.get(index);
}
        return arrays;
}
}


