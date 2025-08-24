package Queue;

public class ReverseAndSumOfAllElement {
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
            Node prev=null;
            Node current=head;
            Node next;

            tail=head;

            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }
    }

    public static void main(String[] args) {
        queueL q=new queueL();
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
