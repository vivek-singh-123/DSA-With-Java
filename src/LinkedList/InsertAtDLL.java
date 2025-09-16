package LinkedList;

public class InsertAtDLL {
    //Node class
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            next = prev = null;
        }
    }

    //display function
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //insert node at head
    public static Node insertAtHead(Node head, int n){
        Node t = new Node(n);
        t.next=head;
        head.prev=t;
        head=t;

        return head;
    }

    //insert node at tail
    public static void insertAtTail(Node head, int n){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        Node t=new Node(n);
        t.prev = temp;
        temp.next = t;
    }

    //insert node at kth position
    public static void insertAtKthPosition(Node head, int idx, int n){
        Node t=new Node(n);

        if(head == null){
            System.out.println("LL is empty");
            return;
        }

        if(head.next == null){ //it means have only 1 element
            head.next=t;
            t.prev=head;
            return;
        }


        Node temp = head;

        for(int i=1; i<idx-1; i++){
            if(temp.next == null){
                System.out.println("plz enter valid index number");
            }
            temp = temp.next;
        }

        temp.next.prev=t;
        t.prev=temp;
        t.next=temp.next;
        temp.next = t;
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        Node a = new Node(10);
        Node b = new Node(2);
        Node c = new Node(99);
        Node tail = new Node(13);

        head.next=a;
        a.prev=head;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=tail;
        tail.prev=c;

        //insert at head
//        display(head);
//        Node newHead = insertAtHead(head, 30);
//        System.out.println(newHead.data);
//        display(newHead);
//
//        System.out.println();

        //insert at tail
//        display(head);
//        insertAtTail(head, 100);
//        display(head);
//
//        System.out.println();

        //insert at kth position
        display(head);
        insertAtKthPosition(head, 1, 7);
        display(head);
    }
}
