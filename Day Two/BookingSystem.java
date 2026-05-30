import java.util.Scanner;
import java.util.Arrays;
import java.util.Arrays;
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
        System.out.print("Enter an operation");
        String user = input.nextLine();

        switch (user) {

        case 1 -> ("You entered a number"


        );
                        }
}

    public static void suggestBooks(){
        int firstPage = 1;
        int lastPage = 100;

    Random random = new Random();
    int randomBookPage = random.nextInt(firstPage, lastPage);
    String randomBookName = books.get(random.nextInt(books.size()-1));

    System.out.println("The book page is: " + randomBookPage + " and the book name is: " + randomBookName);
        
}
     
    public static String addBooks(String bookName){
        
    for(int index = 0 ; index <= books.size()-1; index++ ){
        if(books.get(index).equals(bookName)){
           return "Book already exists ";
}

        else{
            books.add(bookName);
        }
} 
        return "Book added successfully";
}   

    public static String removeBooks(String bookName){
        
        for(int index = 0 ; index <= books.size()-1; index++){
            if(books.get(index).equals(bookName)){
              books.remove(index) ;

}
       }
        return "Book has been successfully removed ";
}

    public static String updateBooks(String oldBook, String newBook){
        
        for(int index = 0; index <= books.size()-1; index++){
            if(books.get[index].equals(oldBook)){
                books.remove(index); 
                books.add(newBook) ;      
        }

}
            return "Book has been updated";
}

    public static String[] showAllBooks(){
    
    String[] arrays = new String[books.size()];

       
    for(int index = 0; index <= books.size()-1; index++){
      arrays[index] = books[index];
}
        return arrays;
}
}


