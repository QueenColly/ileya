import java.util.Arrays;
import java.util.Scanner;

public class LagbajaSchools {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Welcome to Lagbaja Schools!!!... \n");

    System.out.print("Please enter the total number of students: ");
    int studentNumber = input.nextInt();

    System.out.print("Please enter the total  number of subjects? ");
    int subjects = input.nextInt();

     System.out.println("You've entered " + studentNumber + " as the total number of students and " + subjects + " as the total number of subjects they offer per term.  ");
    

    System.out.println("""

    Saving >>>>>>>>>>>>>>>
    Saved Successfully!""");
    System.out.println();

    int [][] grade = new int [studentNumber][subjects];

            //int counter = 1;
            double []total = new double [studentNumber];
             double [] newTotal = new double[studentNumber];
             int []position = new int[studentNumber];
            
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

                 System.out.println("==================================================================================");
       System.out.printf("%18s","STUDENT");
            for(int outer = 1; outer <= subjects; outer++){
                System.out.printf("%10s", "SUBJECT"+ outer);
            }

         System.out.printf("%13s%10s%10s%n",  "TOTAL", "AVERAGE","POSITION");
                 
                 System.out.println("==================================================================================");
    

      for(int outer = 0; outer < total.length; outer++){
       
            newTotal[outer] = total[outer];
       
    }

//     System.out.println(Arrays.toString(newTotal));

        for(int outer =0; outer < newTotal.length; outer++){
            for(int inner = outer+1;inner<newTotal.length; inner++ ){
               double temp = newTotal[outer];

                if(newTotal[outer] < newTotal[inner]){
                    newTotal[outer] = newTotal[inner];
                    newTotal[inner] = temp;
                    }

                 }

            }

            
        for(int outer =0; outer < newTotal.length; outer++){
            for(int inner = 0; inner<newTotal.length; inner++ ){
                 if(total[outer] == newTotal[inner]){
                    position[outer] = inner + 1;
//                    System.out.println(position[outer]);
                    break;
                }
            }
        }
//     System.out.println(Arrays.toString(position));

    for( int indexx = 0; indexx < studentNumber ; indexx++){
       System.out.printf("%16s%d", "Student " , (indexx+1));

          
          for(int counts = 0; counts < subjects;counts++){
                System.out.printf("%10d", grade[indexx][counts]);
             }
              System.out.printf("%10.0f%10.2f%10d%n",total[indexx], average[indexx], position[indexx]);
        }   
    
                 System.out.println("==================================================================================");


    System.out.println("SUBJECT SUMMARY\n ");

    for(int counter = 0; counter <= subjects; counter++){
   
     System.out.println("Subject " + (counter + 1));
    System.out.println("Total score is: " + total[counter]);
        
        }
        
  //  System.out.print("Highest scoring student is: Student " +(index + 1) + "scoring" + (counter + 1));




           

        }
    }
