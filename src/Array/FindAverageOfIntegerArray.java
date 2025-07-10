package Array;

public class FindAverageOfIntegerArray {
    public static void main(String[] args) {
        int arr[]={65,55,89,45,32,67,44,31};
        double add=0;

        for(int i=0; i<=arr.length-1; i++){
            add+=arr[i];
        }
        double avarage=add/arr.length;
        System.out.println("Average of all array elements: "+avarage);
    }
}
