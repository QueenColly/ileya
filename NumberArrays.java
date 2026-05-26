import java.util.Arrays;

public class NumberArrays{
public static void main(String[] args){

    int[] numbers = {45,60,3,10,9,22};

    System.out.println(Arrays.toString(getOdd(numbers)));
    System.out.println(Arrays.toString(getEven(numbers)));

}

    public static int[] getOdd(int[] numbers){

    int [] odd = new int [numbers.length];    
    
    int count = 0;

        for (int outer = 0; outer < numbers.length; outer++){
            if(outer % 2 != 0){
                odd[count] = outer;
                    count++;
                         }
     
}
      return odd;
}

     public static int[] getEven(int[] numbers){

    int [] even = new int [numbers.length];    
    
    int count = 0;

        for (int outer = 0; outer < numbers.length; outer++){
            if(outer % 2 == 0){
               even[count] = outer;
                    count++;
                         }
     
}
      return even;
}
}

