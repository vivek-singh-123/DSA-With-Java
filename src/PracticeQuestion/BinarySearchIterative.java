package PracticeQuestion;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10};  //sorted array for binary search
        int target = 7;
        boolean found = false;
        int start=0, end=arr.length-1;

        while (start <= end){
            int mid = (start+end)/2;
            if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else {
                System.out.println("target found at index: "+mid);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("target not found!!!");
        }
    }
}
