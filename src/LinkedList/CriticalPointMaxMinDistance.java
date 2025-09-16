package LinkedList;

public class CriticalPointMaxMinDistance {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }

    //display function
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //find critical point, local maxima and local minima
    public static void criticalPoint(Node head){
        Node temp = head.next;

        //Local maxima: node.val > node.prev.val && node.val > node.next.val
        //Local minima: node.val < node.prev.val && node.val < node.next.val

        while (temp.next != null){
            if(temp.val > temp.prev.val && temp.val > temp.next.val){
                System.out.println("critical point(maxima):"+temp.val);
            }
            if(temp.val < temp.prev.val && temp.val < temp.next.val){
                System.out.println("critical point(minima):"+temp.val);
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(20);
        Node d = new Node(15);
        Node e = new Node(7);
        Node f = new Node(3);
        Node g = new Node(99);
        Node h = new Node(103);
        Node i = new Node(55);
        Node j = new Node(35);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        i.next=j;
        j.prev=i;

        display(a);
        criticalPoint(a);
    }
}
