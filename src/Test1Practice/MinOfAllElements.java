package Test1Practice;

public class MinOfAllElements {
    public static void main(String[] args) {
        int[] nums={56,68,16,87,10,95};
        int len=nums.length;
        int minNum=Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            minNum=Math.min(minNum, nums[i]);
        }
        System.out.println(minNum);
    }
}
