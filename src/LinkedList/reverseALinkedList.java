package LinkedList;

public class reverseALinkedList {
    static Node head;

    //reverse a linkedList
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    //display function
    public static void display(){
        if(head==null){
            System.out.println("LL is empty!");
            return;
        }
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //Node class
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(15);
        head.next.next=new Node(20);
        head.next.next.next=new Node(25);
        head.next.next.next.next=new Node(30);

        //calling reverse function
        head=reverse(head);
        display();
    }
}
