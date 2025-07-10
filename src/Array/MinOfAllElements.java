//min of all the elements of an integer
package Array;

public class MinOfAllElements {
    public static void main(String[] args) {
        int[] arr = {46,36,59,95,66,17,75,24};
        int minimumvalue = arr[0];

        for(int i=1; i< arr.length; i++) {
            if(arr[i]<minimumvalue){
                minimumvalue = arr[i];
            }
        }
        System.out.print("Minimum number found! and which is: "+ minimumvalue);
    }
}
