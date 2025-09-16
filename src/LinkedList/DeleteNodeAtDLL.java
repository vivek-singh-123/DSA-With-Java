package LinkedList;

public class DeleteNodeAtDLL {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }

    public static void display(Node head){
        while (head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static Node deleteAtHead(Node head){
        //if head is null
        if(head == null){
            System.out.println("LL is empty!");
            return null;
        }

        //if LL has only 1 node
        if(head.next == null){
            return null;
        }

        //is LL has many nodes
        head=head.next;
        head.prev=null;
        return head;
    }

    public static Node deleteAtTail(Node head){
        if(head == null){
            System.out.println("LL is empty");
            return null;
        }

        if(head.next == null){  //means only 1 node
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        temp.next.prev = null;
        temp.next=null;
        return head;
    }

    public static void deleteNodeAtKthPosition(Node head, int idx){
        if(head == null){
            System.out.println("LL is empty!");
            return;
        }
        Node temp = head;

        for(int i=1; i<idx-1; i++){
            if(temp.next == null){
                System.out.println("invalid input");
            }
            temp = temp.next;
        }

        temp.next.next.prev = temp;
        temp.next = temp.next.next;
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

        //delete head node
        display(head);
        System.out.println();
        Node newHead = deleteAtHead(head);
        display(newHead);

        System.out.println();
        System.out.println();

        //delete tail node
        display(newHead);
        System.out.println();
        Node newHead2 = deleteAtTail(newHead);
        display(newHead2);

        System.out.println();
        System.out.println();

        //delete node at any middle element
        display(newHead2);
        System.out.println();
        deleteNodeAtKthPosition(newHead2, 2);
        display(newHead2);
    }
}
