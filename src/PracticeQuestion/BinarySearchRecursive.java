package PracticeQuestion;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,11};  //sorted array for binary search
        int target = 11;
        int start = 0, end = arr.length-1;

        int result = recursiveBS(arr, target, start, end);
        System.out.println(result);

    }

    public static int recursiveBS(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = (start+end)/2;

        if(target == arr[mid]) return mid;
        else if(target > arr[mid])  return recursiveBS(arr, target, mid+1, end);
        else return recursiveBS(arr, target, start, mid-1);

    }
}
