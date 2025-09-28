package PracticeQuestion;

public class BuildMinHeapAnotherWay {
    //step down approach
    public static void heapify(int[] arr, int index, int n){
        int smallest = index;
        int left = 2*index+1;
        int right = 2*index+2;

        if(left < n && arr[left] < arr[smallest]){
            smallest = left;
        }
        if(right < n && arr[right] < arr[smallest]){
            smallest = right;
        }

        if(smallest != index){
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, smallest, n);
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
