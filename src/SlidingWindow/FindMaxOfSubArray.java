package SlidingWindow;

public class FindMaxOfSubArray {
    public static void main(String[] args) {
        int[] arr={3,8,4,5,7,6,12};
        int n=arr.length;
        int w=4;
        int current=0;

        for(int i=0; i<w; i++){
            current+=arr[i];
        }

        int max=current;

        for(int i=1; i<n-w+1; i++){
            current=current-arr[i-1]+arr[w+i-1];
        }

        if(current>max){
            System.out.println(current);
        }else {
            System.out.println(max);
        }
    }
}
