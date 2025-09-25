package PracticeQuestion;

//Check if array is sorted or not
public class ArraySortOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,10,3,4,5};
        boolean isSorted = true;

        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted ? "array is sorted" : "array not sorted!!!");
    }
}
