package PracticeQuestion;

//Return common elements.
public class FindIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,5};
        int i=0, j=0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
    }
}
