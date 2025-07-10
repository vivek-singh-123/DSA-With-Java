//multiplication of all the elements of an integer array
package Array;

public class MultiplicationOfAllElements {
    public static void main(String[] args) {
        int [] arr = {11,6,59,70,61,30};
        int valuestore=1;

        for(int i=0; i<arr.length; i++) {
            valuestore*=arr[i];

        }
        System.out.print("Multiplication of all elements is: "+ valuestore);
    }
}
