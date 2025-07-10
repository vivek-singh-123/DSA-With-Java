//sum of all the elements of an integer array

package Array;

public class SumOfAllInteger {
    public static void main(String[] args) {
        int[] arr = {37,23,31,52,18,63,70,87,99,15};
        int sum=0;

        for(int i=0; i< arr.length; i++) {
            sum+=arr[i];
        }
        System.out.print("Sum of array is: "+ sum);
    }
}
