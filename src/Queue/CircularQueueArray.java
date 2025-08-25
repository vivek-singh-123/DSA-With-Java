package Queue;

public class CircularQueueArray {
    public static class Cqa{   //cqa: circular queue using array
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr=new int[5];

        //add
        public void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full!");
            }
            else if (size==0) {
                front=0;
                rear=0;
                arr[0]=val;
            }
            else if (rear<arr.length-1) {  //this is the normal case
                arr[++rear]=val;
            }
            else if (rear==arr.length-1) {  //this is when rear reach arr length and need add val in queue way
                rear=0;
                arr[0]=val;
            }
            size++;
        }

        //remove
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!!");
            }
            else {
                int val=arr[front];
                if (front==arr.length-1) front=0;
                else front++;
                size--;
                return val;
            }
        }

        //peek
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!!");
            }
            return arr[front];
        }

        //isEmpty function
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        //display
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            }
            else if (front<=rear) {
                for (int i=front; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else if (rear<front) {
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i=0; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Cqa q=new Cqa();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.add(50);
        q.display();
        q.remove();
        q.display();
        q.add(60);
        q.display(); // internally have 60 20 30 40 50...but queue will print 20 30 40 50 60
//        q.add(70);
//        q.display(); //now here queue is full so it will give exception!!!!!

        for(int i=0; i<q.arr.length; i++){
            System.out.print(q.arr[i]+" ");  // array will be printed: 60 20 30 40 50
        }
    }
}
