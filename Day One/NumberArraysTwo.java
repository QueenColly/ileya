import java.util.Arrays;

public class NumberArraysTwo{
public static void main(String[] args){

           int [] numbers =  {1,2,3,2,4,3};
        System.out.println(getDuplicates(numbers));

}

    public static int [] getDuplicates(int[] numbers ){
        int [] duplicates = new int[numbers.length];
    int duplicatesCount = 0;

        for(int index = 0; index < numbers.length; index++){
            int count = 0;

        for (int inner = 0; inner < numbers.length; inner++){
            if(numbers[index] == numbers[inner]){
                count++;
}
}

        if(count > 1){
            int counter = 0;
        for(int outer = 0; outer < duplicatesCount; outer++){
            if(duplicates[outer] == numbers[index]){
                counter = 1;
}
}

        if(counter == 0){
            duplicates[duplicatesCount] = numbers[index];
                duplicatesCount++;
}
}
}

        int []result = new int[duplicatesCount];
        for(int index = 0 ; index < duplicatesCount; index++){
            result[index] = duplicates[index];
}
     return result;
}
       
}

