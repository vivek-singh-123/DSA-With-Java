package Test1Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={7,3,47,6,49,2,40};
        int len=nums.length;

        for(int i=0; i<len; i++){
            int minIndex=i;
            int minValue=nums[i];
            for(int j=i; j<len; j++){
                if(nums[j]<minValue){
                    minValue=nums[j];
                    minIndex=j;
                }

            }
            int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;

        }
        System.out.println(Arrays.toString(nums));
    }
}
