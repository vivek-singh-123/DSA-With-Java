package PracticeQuestion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,15,11,8};
        int target = 11;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("target found at index: "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("target not found!");
        }
    }
}
