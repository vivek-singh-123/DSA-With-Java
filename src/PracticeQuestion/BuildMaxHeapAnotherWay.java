package PracticeQuestion;

public class BuildMaxHeapAnotherWay {
    //step down approach
    public static void heapify(int[] arr, int index, int n){
        int largest = index;
        int left = 2*index+1;
        int right = 2*index+2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }

    }
    public static void buildMaxHeap(int[] arr, int n){
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, i, n);
        }
    }

    public static void display(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //main function
    public static void main(String[] args) {
        int[] arr = {10,3,8,9,5,13,18,14,11,70};
        int n = arr.length;
        buildMaxHeap(arr, n);
        display(arr);
    }
}
