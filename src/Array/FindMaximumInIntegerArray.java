package Array;

public class FindMaximumInIntegerArray {
    public static void main(String[] args) {
        int store_value=Integer.MIN_VALUE;
        int arr[]={11,64,82,9,71,0,36,79,10};

        for(int i=0; i<arr.length; i++){
            if(store_value<arr[i]){
                store_value=arr[i];
            }
        }
        System.out.println("Maximum number in given array is: "+store_value);
    }
}
