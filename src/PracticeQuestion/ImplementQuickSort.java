package PracticeQuestion;

public class ImplementQuickSort {
    public static void main(String[] args) {
        int[] arr = {10,5,2,17,80,45,110};
        int len=arr.length;
        quickSort(arr, 0, len-1);

        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    public static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pi=partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
}
