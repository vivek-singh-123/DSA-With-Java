package LinkedList;

public class findNthNodeFromEnd {
    static Node head;

    //nth node from last
    public static Node nthNode(Node head, int n){
        int size=0;

        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }

        int m = size-n+1;
        temp=head;
        for (int i=1; i<=m-1; i++){
            temp=temp.next;
        }
        return temp;
    }

    //nth node from last but single traversal
    public static Node NthNodeFromLat(Node head, int n){
        Node slow=head;
        Node fast=head;

        for(int i=1; i<=n; i++){
            fast=fast.next;
        }

        while (fast != null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    //node class
    public static class Node{
        int data;
        Node next;

        Node(int x){
            this.data=x;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        head=new Node(2);
        head.next=new Node(4);
        head.next.next=new Node(7);
        head.next.next.next=new Node(11);
        head.next.next.next.next=new Node(17);

        Node result = nthNode(head,2);
        System.out.println(result.data);

        Node result2=NthNodeFromLat(head, 3);
        System.out.println(result2.data);
    }
}
