package Array;
                                              //this is the naive approach/bruteforce approach/basic approach
public class SlidingWindowSumOfSubArray {
    public static void main(String[] args) {
        int[] arr={7,5,19,15,21,8,2,13};
        int len=arr.length;
        int window=3;
        int current=0;
        for (int i=0; i<window; i++){
            current+=arr[i];
        }
        int max=current;
        for(int i=1; i<=len-window; i++){
            current=0;
            for(int j=i; j<i+window; j++){
                current=current+arr[j];
            }
            max=Math.max(current, max);
        }
        System.out.println(max);

    }
}
