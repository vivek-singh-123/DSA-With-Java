package Array;

public class FindMinimumInIntegerArray {
    public static void main(String[] args) {
        int arr[] ={124,20,30,45,86,234};
        int store=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(store>arr[i]){
                store=arr[i];
            }
        }
        System.out.println(store+ " is the minimum number");
    }
}
