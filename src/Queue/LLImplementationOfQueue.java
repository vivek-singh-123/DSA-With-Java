package Queue;

public class LLImplementationOfQueue {
    //user defined data type
    public static class Node{
        int val;
        Node next;

        Node(int data){
            val=data;
        }
    }

    //user defined class
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size = 0;

        //add
        public void add(int x){
            Node newNode=new Node(x);

            if(size==0){
                head = tail = newNode;
            }
            else {
                tail.next=newNode;
                tail=newNode;
            }
            size++;
        }

        //remove
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }

            int x=head.val;
            head=head.next;
            size--;
            return x;
        }

        //peek
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
           return head.val;
        }

        //display
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return;
            }

            Node temp=head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        //check empty
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }

    }

    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size);
    }
}
