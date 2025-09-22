package PracticeQuestion;

// Find Second-Largest Element in an Array
public class SecondLargestElement {  // T.C ==> O(n)
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
