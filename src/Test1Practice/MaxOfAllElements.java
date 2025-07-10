package Test1Practice;

public class MaxOfAllElements {
    public static void main(String[] args) {
        int[] nums={10,20,40,75,15,6,5,68,9,35,};
        int len=nums.length;
        int maxnum=Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            maxnum=Math.max(maxnum, nums[i]);
        }
        System.out.println(maxnum);
    }
}
