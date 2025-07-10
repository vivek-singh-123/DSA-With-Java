package Array;

public class FindSumOfAnArrayElements {
    public static void main(String[] args) {
        int arr[]={6,59,33,79,56,69,37,97};
        int add=0;

        for(int i=0; i<arr.length; i++){
            add+=arr[i];
        }
        System.out.println("Sum of all elements: "+add);
    }
}
