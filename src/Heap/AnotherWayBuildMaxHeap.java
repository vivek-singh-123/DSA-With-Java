package Heap;

public class AnotherWayBuildMaxHeap {
    //heapify function
    public static void heapify(int[] arr, int index, int n){
        //Recursive heapify has O(h) space, where h = height of heap = O(log n)
        //Not O(n). Because in worst case, recursion depth = height of binary tree = log n


        //if you want space stay O(1) so we can use iterative approach here, through while loop..........
        int largest = index;
        int left = 2*index+1;
        int right = 2*index+2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        // if largest is not the root, swap and heapify again
        if(largest != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);  //recursion goes down the tree
        }
    }

    //MaxHeap build function
    public static void buildMaxHeap(int[] arr, int n){   //t.c ==> O(log n)
        //step down approach
        for(int i=(n/2)-1; i>=0; i--){
            heapify(arr, i, n);
        }
    }

    //display
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 9, 5, 13, 18, 14, 11, 70};
        buildMaxHeap(arr, 10);
        display(arr);
    }
}
