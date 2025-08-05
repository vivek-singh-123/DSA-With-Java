package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,11,15,20};
        int target=11;

       int result= binarySearch(arr,target);
        System.out.println("target found at index: "+result);
    }

    public static int binarySearch(int[] arr, int target){
        int len=arr.length;
        int start=0;
        int end=len-1;

        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
