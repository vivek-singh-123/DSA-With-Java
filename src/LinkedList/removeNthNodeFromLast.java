package LinkedList;

public class removeNthNodeFromLast {
    static Node head;
    //remove nth node from last
    public static  Node removeNthNode(Node head, int n){

        Node slow=head;
        Node fast=head;

        for (int i=1; i<=n; i++){
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while (fast.next  != null){
            slow=slow.next;
            fast=fast.next;
        }
          slow.next=slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    //Node class
    public static class Node{
        int val;
        Node next;

        Node(int x){
            this.val=x;
        }
    }
    public static void main(String[] args) {
        head=new Node(21);
        head.next=new Node(19);
        head.next.next=new Node(31);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(41);

        display(head);
        head=removeNthNode(head, 3);
        display(head);
    }
}
