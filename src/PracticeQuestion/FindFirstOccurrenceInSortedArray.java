package PracticeQuestion;

//Find first index of target in sorted array with duplicates.
public class FindFirstOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int target = 2;
        int result = -1;
        int start = 0, end = arr.length-1;

        while (start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                result = mid;
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        if(result  != -1){
            System.out.println("first occurrence at index: "+result);
        }else {
            System.out.println("target not found!!!!!!!!");
        }
    }
}
