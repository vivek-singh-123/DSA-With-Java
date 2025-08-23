package Queue;

public class reverseTheCompleteQueue {
    public static class Node{
        int val;
        Node next;

        Node(int x){
            val=x;
            next=null;
        }
    }

    //custom queue class using LL
    public static class queueL{
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

        //sum of all element in queue
        public int sum(){
            Node temp=head;
            int sum=0;
            while (temp != null){
                sum+=temp.val;
                temp=temp.next;
            }
            return sum;
        }

        //reverse
        public void reverse() {
            if (head == null) return;

            int x = remove();
            reverse();
            add(x);
        }


    }
    public static void main(String[] args) {
        queueL q=new queueL();
        System.out.println(q.isEmpty());
        q.add(11);
        q.add(7);
        q.add(2);
        q.add(15);
        q.display();
        q.reverse();
        q.display();
        q.add(11);
        q.display();
        q.reverse();
        q.display();
    }
}
