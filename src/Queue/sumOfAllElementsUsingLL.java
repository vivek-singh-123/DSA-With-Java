package Queue;

public class sumOfAllElementsUsingLL {
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

    }
    public static void main(String[] args) {
        queueL q=new queueL();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(5);
        q.add(3);
        q.add(7);
        q.display();
        System.out.println(q.sum());
        q.remove();
        System.out.println(q.sum());
    }
}
