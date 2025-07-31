package Only_for_Practice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,5,66,7,9,10,45,1};
        selectionSort(arr);
        for (int a: arr){
            System.out.print(a+" ");
        }
    }

    static void selectionSort(int[] arr){
        int len=arr.length;

        //outer loop
        for(int i=0; i<len-1; i++){
            int smallest=i;
            //inner loop
            for(int j=i+1; j<len; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
}
