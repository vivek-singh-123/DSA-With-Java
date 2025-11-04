package SlidingWindow;

// Minimum size sub array sum ≥ target
public class MinimumSumSubArrayEqualTarget {
    public static void main(String[] args) {
        int[] nums = {10,2,20,7,10,4,15,11};
        int n = nums.length;
        int target = 20;
        int minSize = Integer.MAX_VALUE;
        int low = 0, high = 0;
        int currentSum = 0;

        for(high = 0; high<n; high++){
            currentSum += nums[high];
            while(currentSum >= target){
                int currentWindow = high-low+1;
                minSize = Math.min(minSize, currentWindow);
                currentSum = currentSum - nums[low];
                low++;
            }
        }

        System.out.println(minSize);
    }
}
