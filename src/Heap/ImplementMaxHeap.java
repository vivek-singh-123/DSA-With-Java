package Heap;

public class ImplementMaxHeap {
    public static class maxHeap{
        int[] arr;
        int curr_size;
        int total_size;

        maxHeap(int n){
            arr=new int[n];
            curr_size=0;
            total_size=n;
        }


        //insert into the max heap
        public void insert(int value){
            //check the size of heap
            if(curr_size == total_size){
                System.out.println("heap size overflow");
                return;
            }

            arr[curr_size] = value;
            int index = curr_size;
            curr_size++;

            //compare it with its parent
            while (index > 0 && arr[(index-1)/2] < arr[index]){
                int temp = arr[index];
                arr[index] = arr[(index-1)/2];
                arr[(index-1)/2] = temp;
                index = (index-1)/2;
            }
            System.out.println(value+" is inserted into heap");
        }


        //heapify
        public void heapify(int index){
            int largest = index; //this will store the index of the element which is greater between parent, left and right child
            int left = 2*index+1;
            int right = 2*index+2;

            if(left < curr_size && arr[left] > arr[largest]){
                largest = left;
            }
            if(right < curr_size && arr[right] > arr[largest]){
                largest = right;
            }

            if(largest != index){
                int temp = arr[index];
                arr[index] = arr[largest];
                arr[largest] = temp;

                heapify(largest);
            }
        }


        //delete top node(root)
        public void delete(){
            if(curr_size == 0){
                System.out.println("heap underflow");
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


        //display heap
        public void display(){
            for (int i=0; i<curr_size; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        maxHeap mh=new maxHeap(6);
        //insert into heap
        mh.insert(4);
        mh.insert(14);
        mh.delete();
        mh.insert(11);
        mh.insert(114);
        mh.insert(24);
        mh.insert(1);
        mh.delete();
       // mh.insert(10);  //it will overflow bcz size is 6 only

        //print
        System.out.println();
        mh.display();

        //delete top node
        System.out.println();
        mh.delete();
        mh.display();
    }
}
