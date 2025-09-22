package PracticeQuestion;

// Find a Pair with a Given Sum
public class FindAPair {  // T.C ==> O(n^2)
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 15};
        int target = 9;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println(arr[i]+" "+ arr[j]);
                    break;
                }
            }
        }
    }
}
