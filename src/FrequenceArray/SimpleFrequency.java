package FrequenceArray;

import java.util.Arrays;

public class SimpleFrequency {
    public static void main(String[] args) {
        int[] nums={2,8,3,4,8,3,5,4,1,2,5};
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
        }
        int[] freq=new int[max+1];

//        for(int i=0; i<nums.length; i++){
//            freq[nums[i]]++;
//        }
//        System.out.println(Arrays.toString(freq));

        for(int a: nums){
                freq[a]++;
        }
        System.out.println(Arrays.toString(freq));
    }
}
