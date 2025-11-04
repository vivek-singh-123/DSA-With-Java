package SlidingWindow;

public class FindMaxOfSubArray {
    public static void main(String[] args) {
        int[] arr={3,8,4,5,7,6,12};
        int k = 3;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        maxSum = sum;
        for(int i=k; i<arr.length; i++){
            sum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Max sum of subarray of size "+k+" is: "+maxSum);
    }
}
