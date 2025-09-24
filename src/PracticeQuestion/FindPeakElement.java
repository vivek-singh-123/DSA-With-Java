package PracticeQuestion;

//Element greater than neighbors.
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {0,5,10,8,3};
        int start = 1, end = arr.length-2;
        int result = -1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                result = mid;
                break;
            }
            else if(arr[mid-1] < arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        System.out.println(result);
    }
}
