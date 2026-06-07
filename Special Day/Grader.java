import java.util.Arrays;
import java.util.Scanner;

public class Grader{
public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students enrolled: ");
        int enrolled = input.nextInt();

        System.out.print("Enter number of quizzes taken: ");
        int quiz = input.nextInt();


        int [][] grade = new int [enrolled][quiz];
     
        int score =0;
        
    for(int index =0 ; index < grade.length; index++){
        for(int inner = 0; inner < grade[index].length; inner++){
            
        System.out.print("Enter score: ");
         score = input.nextInt();

            grade [index][inner] = score;
        }

}

            System.out.println(Arrays.deepToString(grade));

        for(int index = 0; index < grade.length; index++){
            double total = 0;
        for(int inner =0; inner < grade[index].length; inner++){
            total = total + grade[index][inner];

            }
            double average = total / grade[index].length;
                System.out.println("The total is: " + total + " " );
                 System.out.println("The average is :" + average + " ");

        }
}

}
