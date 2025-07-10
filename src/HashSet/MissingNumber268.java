package HashSet;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber268 {
    public static void main(String[] args) {

        int[] nums={3,1,0,4,2,5,7};
        int missnumber= missingNumber(nums);

        System.out.println(missnumber);
    }

    public static int missingNumber(int[] nums){
        int len=nums.length;
        Set<Integer> hs=new HashSet<>();
        for(int a: nums){
            hs.add(a);
        }
        for(int i=0; i<=len; i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return  -1;
    }
}
