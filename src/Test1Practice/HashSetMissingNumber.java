package Test1Practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetMissingNumber {
    public static void main(String[] args) {
        int[] nums={1,8,3,6,7,2,5};

      int missnum=missNumber(nums);
        System.out.println(missnum);

    }
    static int missNumber(int[] nums){
        int len=nums.length;
        Set<Integer> hs=new HashSet<>();
        for(int a:nums){
            hs.add(a);
        }
        for (int i=1; i<len; i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
