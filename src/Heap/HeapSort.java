package Heap;

public class HeapSort {
                                    //convert array into MaxHeap
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

    public static void buildMaxHeap(int[] arr, int n){  //t.c of build max heap is O(n)
        for(int i=(n/2)-1; i>=0; i--){
            heapify(arr, i, n);
        }
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
                                                    //sort an array

    //MaxHeap arry ==> 70 14 18 11 5 13 8 9 10 3
    public static void sortArray(int[] arr, int n){
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 9, 5, 13, 18, 14, 11, 70};
        buildMaxHeap(arr, 10);
        display(arr);
        sortArray(arr, 10);    //t.c of heap sort ==> O(n log n), and s.c O(log n) bcz following recursive approach,
                                  // if you implement heapify function in itrative approach so s.c would be O(1)
        display(arr);
    }
}
