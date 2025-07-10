package Array;

public class FindPositiveNegativeElements {
    public static void main(String[] args) {
        int [] arr = {1, -2, 36, -50, 9, -17};
        int positive = 1;
        int negative = 1;

        for(int i=0; i< arr.length; i++) {
            if(arr[i]< 0){
                negative = negative * arr[i];
            } else {
                positive = positive * arr[i];
            }
        }

        System.out.print("Sum of positive and negative elements: "+ (positive+negative));
    }
}
