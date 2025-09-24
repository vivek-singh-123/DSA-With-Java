package PracticeQuestion;

//Search target in rotated sorted array.
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int result = -1;
        int start =0, end=arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                result = mid;
                break;
            }

            if(arr[start] <= arr[mid]){ //left part
                if(arr[start] <= target && target < arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            } else {  //if(arr[mid] <= arr[end])   //right part
                if(arr[mid] <= target && target <= arr[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }

        System.out.println(result);
    }
}
