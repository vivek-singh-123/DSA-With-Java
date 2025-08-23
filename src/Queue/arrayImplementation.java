package Queue;

public class arrayImplementation {
    public static class queueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr=new int[5];

        //add
        public void add(int data){
            if(rear == arr.length-1){
                System.out.println("Queue is full!");
                return;
            }

            if(front == -1){
                rear = front = 0;
                arr[0]=data;
            } else {
                arr[rear+1] = data;
                rear++;
            }
            size++;
        }

        //remove
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }

           front++;
            size--;
            return arr[front-1];
        }

        //peek
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }

            return arr[front];
        }

        //isEmpty
        public boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }

        //display
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return;
            }

            for (int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueA q=new queueA();
        System.out.println(q.isEmpty());
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
