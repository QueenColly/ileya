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
    

    System.out.println("""

    Saving >>>>>>>>>>>>>>>
    Saved Successfully!""");
    System.out.println();

    int [][] grade = new int [studentNumber][subjects];

            int counter = 1;
            double []total = new double [studentNumber];
            double [] average = new double [studentNumber];
           
            int count ;
            int index;
        for( index = 0; index < grade.length; index++){
            for( count =0; count < grade[index].length ; count++){
            System.out.println("\nEntering score for student "+ (index + 1) + ": ");
          
            System.out.print("Enter score for subject "+ (count + 1) + ": ");
                            
            int score = input.nextInt();
            grade[index][count] = score;
            
            System.out.print("""
            Saving >>>>>>>>>>>>>>>
            Saved Successfully!""");
            System.out.println();                     
                }

        }
//
    System.out.println("\nThe grades are:  "+ Arrays.deepToString(grade));

         for(  index = 0; index < grade.length; index++){
            for( count = 0; count < grade[index].length; count++){
                    total[index] += grade[index][count];
}

       
     average[index] = total[index]/subjects;
    

}
    
       
     System.out.println("\nTotal score of student  is: " + Arrays.toString(  total));
     System.out.println("The average is: " +    Arrays.toString( average));

                 System.out.println("=====================================================================================================");
       System.out.printf("%20s","STUDENT");
            for(int outer = 1; outer <= subjects; outer++){
                System.out.printf("%10s", "SUB"+ outer);
            }

         System.out.printf("%13s%13s%13s%n",  "TOTAL", "AVERAGE","POSITION");
                 System.out.println("=====================================================================================================");
  
    

    for( int indexx = 0; indexx < studentNumber ; indexx++){
       System.out.printf("%20s%d", "Student " , (indexx+1));

          
          for(int counts = 0; counts < subjects;counts++){
                System.out.printf("%10d", grade[indexx][counts]);

                
            }
               
                System.out.printf("%10.0f%10.2f%n",total[indexx], average[indexx]);
        }   
    
                System.out.println("=====================================================================================================");




            
        }
    }
