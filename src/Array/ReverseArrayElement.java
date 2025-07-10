package Array;

import java.util.Arrays;

public class ReverseArrayElement {
    public static void main(String[] args) {
        int [] array = {66,24,9,5,54,38,49,127};
        int [] arr = new int[array.length];

        int j =0;
        for(int i= array.length-1; i>=0; i--){
            arr[j] = array[i];
            j++;
        }
        System.out.print(Arrays.toString(arr));
    }
}

//another method
//public class ReverseArrayElement {
//    public static void main(String[] args) {
//        int [] array = {66,24,9,5,54,38,49,26};
//
//        for(int i= array.length-1; i>=0; i--){
//            System.out.print(array[i]+ " ");
//        }
//    }
//}