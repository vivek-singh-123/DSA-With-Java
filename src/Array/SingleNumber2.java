//package Array;
//
//public class SingleNumber2 {
//    public static void main(String[] args) {
//        int[] nums={2,2,3,2};
//    }
//
//    public static int[] singleNumber(int[] nums){
//        int len=nums.length;
//        int[] ref=new int[len];
//        for(int a: nums){
//            ref[a]++;
//        }
//        for(int i=0; i<len; i++){
//            if(ref[i]!=3){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
