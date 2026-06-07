import java.util.Arrays;
import java.util.Scanner;

public class LagbajaSchools {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Welcome to Lagbaja Schools!!!... \n");

    System.out.print("\nPlease enter the number of students: ");
    int studentNumber = input.nextInt();

    System.out.print("\nPlease enter the  number of subjects? ");
    int subjects = input.nextInt();

     System.out.println("\nYou've entered " + studentNumber + " as the total number of students and " + subjects + " of the total number of subjects they offer per term.  ");
    

    System.out.println("\nSaving >>>>>>>>>>>>>>>");
    System.out.println("\nSaved Successfully");

    int [][] grade = new int [studentNumber][subjects];

            int counter = 1;
        for(int index = 0; index < grade.length; index++){

            for(int count =0; count < grade[index].length ; count++){

    

    System.out.print("\nPlease enter the student's score:  ");
    int score = input.nextInt();
    grade[index][count] = score;

    
           
       
}
}

    System.out.println("\nThe grades are:  "+ Arrays.deepToString(grade));


             double total =0;
        for(int index = 0; index < grade.length; index++){
    
            for(int count = 0; count < grade[index].length; count++){

        total += grade[index][count];
}
       

        double average = total/grade[index].length;
        
         System.out.println("\nTotal score of student "+ counter + " is: " + total);
                counter++;
        System.out.println("\nThe average is: " + average);
}
   

    


}



}
