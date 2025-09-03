package Interview_Prepare_ThriftyAI;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,7,2,3,15,6};
        int n = arr.length;
        int target=15;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                System.out.println("target is found at index: "+i);
                return;
            }
        }
        System.out.println("target is not found!!!!!!!!");
    }
}
