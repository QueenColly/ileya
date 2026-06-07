import java.util.Arrays;

import java.util.Scanner;


public class LearnHubAcademy {
public static void main (String[] args){

    Scanner input = new Scanner(System.in);
        

    System.out.print("Enter number of student enrolled: ");
    int enrolled = input.nextInt();
            

           
        System.out.print("Enter number of quiz taken: ");
        int quiz = input.nextInt();
        
        

        int [][] grade = new int [enrolled][quiz];


        for(int count = 0; count < grade.length; count++){

        for(int index = 0; index < grade[count].length; index++){

        System.out.print("Enter score: ");
            int score = input.nextInt();
              grade[count][index] = score;

       
}

}
 

         System.out.println(Arrays.deepToString(grade));
        
        
    for(int count = 0; count < grade.length; count++){
    double total = 0;
            for(int index = 0; index < grade[count].length; index++){
            total += grade[count][index];

    }
    double average = total/grade[count].length;
    System.out.println(total + " " + average + " ");

}
 


}

}
   

