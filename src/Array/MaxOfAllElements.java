//max of all the elements of an integer
package Array;

public class MaxOfAllElements {
    public static void main(String[] args) {
        int[] arr = {46,360,59,903,66,17,751,24};

        int maxvalue = arr[0];

        for(int i=1; i< arr.length; i++) {
            if(arr[i]>maxvalue) {
                maxvalue = arr[i];
            }
        }
        System.out.print("max value is: "+ maxvalue);
    }
}
