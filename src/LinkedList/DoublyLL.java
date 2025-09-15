package LinkedList;

public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            next = prev = null;
        }
    }

    public static void display(Node head){
        Node temp = head;
        System.out.print("from head side: ");
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void display2(Node tail){
        Node temp = tail;
        System.out.print("from tail side: ");
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayRandom(Node random){
        Node temp = random;
        while (temp.prev != null){  //back to the head
            temp = temp.prev;
        }

        while (temp != null){  //temp on the head now can print......
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
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

//        display(head);
//        display2(tail);
        displayRandom(b);
    }
}
