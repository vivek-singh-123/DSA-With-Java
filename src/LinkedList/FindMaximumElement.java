package LinkedList;

public class FindMaximumElement {
    static Node head;    //if you want to initialize head aa a global variable
    public static class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
    }

    //Find the maximum element in the linked list
    public int maxKthElement(){   //if you don't initialize head as global var so you need to pass hear head!!!
        Node temp=head;

        if(temp==null){
            System.out.println("LL is null");
            return -1;
        }

        int max=Integer.MIN_VALUE;
        while (temp != null){
            max=Math.max(max,temp.data);
            temp=temp.next;
        }
        return max;
    }
    public static void main(String[] args) {
        head=new Node(10);  //this is for global variable head if you initialize!!!!!!!!
        head.next=new Node(5);
        head.next.next=new Node(100);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(17);
        head.next.next.next.next.next=new Node(15);

        FindMaximumElement f=new FindMaximumElement();
        int max = f.maxKthElement();
        System.out.println(max);

    }
}
