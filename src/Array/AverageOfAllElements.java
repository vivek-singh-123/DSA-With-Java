//average of all the elements of an integer array

package Array;

public class AverageOfAllElements {
    public static void main(String[] args) {
        int[] arr = {46,36,59,95,66,21,75,24};
        double add=0;

        for(int i=0; i< arr.length; i++) {
            add+=arr[i];

        }
        System.out.print("Average of all elements is: "+ add/arr.length);
    }
}
