package BitManipulation;

public class FindOneNonRepeatingElement {
    //find the only non-repeating element in an array where every element repeats twice.
    public static void main(String[] args) {
        int[] arr={2,3,5,7,3,1,7,2,5};

        int result=0;

        for(int i=0; i<arr.length; i++){
            result=result^arr[i];
        }
        System.out.println(result);
    }
}
