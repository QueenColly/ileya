import java.util.Arrays;

public class NumberArrays{
public static void main(String[] args){

     int[] numbers = {45,60,3,10,9,22};
    System.out.println(Arrays.toString(getOdd(numbers)));
    System.out.println(Arrays.toString(getEven(numbers)));
//
//              int[] numbers = {45,0,8,0,45};
        System.out.print(getPalindrome(numbers));

//            int[] numbers = {4,7,9,10,16,18};
        System.out.print(getPerfectSquare(numbers));

            int[] number = {4,7,9,10,49,6};
        System.out.println(getNonPerfectSquare(number));
}


    public static int[] getOdd(int[] numbers){

    int [] odd = new int [numbers.length];    
    
    int count = 0;

        for (int outer = 0; outer < numbers.length; outer++){
            if(numbers[outer] % 2 != 0){
                odd[count] = numbers[outer];
                    count++;
                         }
     
        }
        int [] justOdds = new int[count];

        for (int index = 0; index < justOdds.length; index ++){
            justOdds[index] = odd[index];
        }
      return justOdds;
}

     public static int[] getEven(int[] numbers){

    int [] even = new int [numbers.length];    
    
    int count = 0;

        for (int outer = 0; outer < numbers.length; outer++){
            if(numbers[outer] % 2 == 0){
               even[count] = numbers[outer];
                    count++;
                         }
     
}
    int [] justEven = new int [count];
        for(int index = 0; index < count; index++){
                justEven[index] = even[index];
            }
      return justEven;
}


    public static boolean getPalindrome(int[] numbers){

    int[] array = new int[numbers.length];

        int count = 0;
   for(int index = numbers.length-1; index >= 0 ; index--){
       array[count] = numbers[index];
       count++;
}

    for(int inner = 0; inner < numbers.length; inner++){
        if( numbers[inner] == array[inner]){
            return true;        
        }
    }
    return false;
}

    public static int [] getPerfectSquare(int[] numbers){
        int [] arrays = new int[numbers.length];
        int count = 0;
        // current = 0;
    for(int outer = 0; outer< numbers.length; outer++){
       int current = numbers[outer];

    for(int inner = 1; inner * inner <= current; inner++){
        if(inner * inner == current){
            arrays[count] = current;
                count++;
}
}
}
       

    int [] result = new int[count];
    for(int outer = 0; outer < count; outer++){
        result[outer] = arrays[outer];
}
    return result;
}

   public static int [] getNonPerfectSquare(int [] number){
       for(int outer = 0; outer < number.length; outer++){
        int current = number[outer];
        int counter = 0;

        for(int inner = 1; inner * inner <= current; inner++){
            if( inner * inner == current){
                counter = 1;
}
}

    if(counter == 0){
        number[outer] = -1;
}
   
} 
 return number;
}
}


