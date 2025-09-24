    package PracticeQuestion;

    public class FindFloorInSortedArray {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,8,10,12,15};
            int target = 13;
            int result = -1;

            int start=0, end=arr.length-1;

            while (start <= end){
                int mid = (start+end)/2;
                if(arr[mid] == target){
                    result = arr[mid];
                    break;
                }
                else if(target > arr[mid]){
                    result = arr[mid];
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }

            if(result == -1){
                System.out.println("no floor exists!");
            }else {
                System.out.println("floor: "+result);
            }
        }
    }
