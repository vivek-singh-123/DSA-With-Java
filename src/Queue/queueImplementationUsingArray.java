package Queue;

public class queueImplementationUsingArray {

    public static class queue{
        static int[] arr;
        static int size;
        static int rear=-1;

        queue(int n){
            arr=new int[n];
            this.size=n;
        }

        //check empty
        public boolean isEmpty(){
            return rear == -1;
        }

        //enqueue(add)
        public void add(int data){
            if(rear == size-1){
                System.out.println("queue size is full!");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        //dequeue(remove)
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty!");
                return -1;
            }

            int front=arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public int peek(){
            if (isEmpty()){
                System.out.println("queue is empty!");
                return -1;
            }

            return arr[0];
        }

    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(2);
        q.add(5);
        q.add(7);
        q.add(11);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
