package Test1Practice;

public class LinearSearchTargetFound {
    public static void main(String[] args) {
        int[] nums={4,79,53,89,8,56,14};
        int target=56;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                System.out.println("target found at index: "+i);
            }
        }
    }
}
