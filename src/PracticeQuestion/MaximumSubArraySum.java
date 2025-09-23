package PracticeQuestion;

// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest
// sum and return its sum.
public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

//        for(int start=0; start<n; start++){  // T.C ==> O(n^2)
//            int currSum = 0;
//            for(int end = start; end<n; end++){
//                currSum += arr[end];
//                maxSum = Math.max(maxSum, currSum);
//            }
//        }



           // Kadane's Algorithm.....................
        int currSum = 0;    // T.C ==> O(n)
        for(int i=0; i<n; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }

        System.out.println("max sub array sum: "+maxSum);
    }
}
