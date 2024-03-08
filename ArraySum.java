import java.util.*;
public class ArraySum {

        public static int ArraySum(int[] array){
            int sum = 0;
            for(int i=0; i<array.length; i++){
                sum += array[i];
            }
            System.out.println("Sum: " + sum);
            return sum;
        }
        public static void main(String[] args) {
            int[] array = {3,4,5,7,9};
            ArraySum(array);
        }

    // public static void kadanes(int numbers[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;
        
    //     for (int i = 0; i < numbers.length; i++){
    //         cs += numbers[i];
    //         if (cs < 0){
    //             cs = 0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
    //     System.out.println("Max sum subArray is: " + ms);
    // }

    
    // public static void main(String[] args) {
    //     int array[] = {2, -3, -8, 5, 6, -7, 8};
    //     kadanes(array);
    // }
}
