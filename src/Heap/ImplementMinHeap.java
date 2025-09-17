package Heap;

public class ImplementMinHeap {
    public static class minHeap{
        int[] arr;
        int curr_size;
        int total_size;

        minHeap(int size){
            arr=new int[size];
            curr_size=0;
            total_size=size;
        }


        //insert
        public void insert(int value){
            //checking the current size
            if(curr_size == total_size){
                System.out.println("MinHeap is overflow");
                return;
            }

            arr[curr_size] = value;
            int index = curr_size;
            curr_size++;

            //compare it with it's parent
            while (index > 0 && arr[index] < arr[(index-1)/2]){
                int temp = arr[index];
                arr[index] = arr[(index-1)/2];
                arr[(index-1)/2] = temp;
                index = (index-1)/2;
            }
            System.out.println(value + " inserted into MinHeap successfully");
        }

        //heapify function
        public void heapify(int index){
            int minimum = index;
            int left = 2*index+1;
            int right = 2*index+2;

            if (left < curr_size && arr[minimum] > arr[left]){
                minimum = left;
            }
            if(right < curr_size && arr[minimum] > arr[right]){
                minimum = right;
            }

            if(minimum != index){
                int temp = arr[index];
                arr[index] = arr[minimum];
                arr[minimum] = temp;

                heapify(minimum);
            }
        }
        //delete the top node
        public void delete(){
            if(curr_size == 0){
                System.out.println("MinHeap is underflow");
                return;
            }

            System.out.println(arr[0]+" deleted from heap");
            arr[0] = arr[curr_size-1];
            curr_size--;

            if(curr_size == 0){
                return;
            }

            heapify(0);
        }

        public int peek(){
            if(curr_size == 0){
                System.out.println("MinHeap is empty!");
                return -1;
            }
            return arr[0];
        }

        //display heap
        public void display(){
            for(int i=0; i<curr_size; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        minHeap mh=new minHeap(7);
        mh.insert(7);
        mh.insert(10);
        mh.delete();
        mh.insert(15);
        mh.insert(20);
        mh.insert(25);
        mh.insert(40);
        mh.delete();
        mh.insert(1);
        mh.delete();
        //mh.insert(100);

        System.out.println();
        mh.display();

        int top = mh.peek();
        System.out.println(top);
    }
}
