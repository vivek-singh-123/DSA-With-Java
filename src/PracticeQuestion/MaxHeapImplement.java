package PracticeQuestion;

public class MaxHeapImplement {
    public static class maxHeap{
        int[] arr;
        int size;
        int total_size;

        maxHeap(int n){
            arr=new int[n];
            size=0;
            total_size=n;
        }

        //insert
        public void insert(int value){
            if(size == total_size){
                System.out.println("maxheap overload");
                return;
            }

            arr[size] = value;
            int index = size;
            size++;

            while (index > 0 && arr[(index-1)/2] < arr[index]){
                int temp = arr[index];
                arr[index] = arr[(index-1)/2];
                arr[(index-1)/2] = temp;
                index = (index-1)/2;
            }

        }

        //print
        public void display(){
            for(int i=0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
        }

        //heapify for delete node
        public void heapify(int index){
            int largest = index;
            int left = 2*index+1;
            int right = 2*index+2;

            if(left < size && arr[left] > arr[index]){
                largest = left;
            }
            if(right < size && arr[right] > arr[index]){
                largest = right;
            }

            if(largest != index){
                int temp = arr[index];
                arr[index] = arr[largest];
                arr[largest] = temp;

                heapify(largest);
            }
        }
        //delete
        public void delete(){
            if(size == 0){
                System.out.println("maxheap is underflow");
                return;
            }

            System.out.println(arr[0]+" successfully deleted!!");
            arr[0] = arr[size-1];
            size--;

            heapify(0);
        }

    }
    public static void main(String[] args) {
        maxHeap mh=new maxHeap(5);
        mh.insert(10);
        mh.insert(20);
        mh.insert(5);
        mh.insert(40);
        mh.insert(33);

        mh.display();
        System.out.println();

        mh.delete();
    }
}
