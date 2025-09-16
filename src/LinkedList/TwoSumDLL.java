package LinkedList;

public class TwoSumDLL {
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

    //two sum == target
    public static void twoSumTarget(Node head, int target){  //must be LL is sorted
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }

        boolean found = false;
        Node left = head;
        Node right = tail;
        while (left != right){
            if(left.val + right.val == target){
                System.out.println("target found which both element are: "+left.val+", "+right.val);
                found = true;
                break;
            }
            else if (left.val + right.val > target){
                right = right.prev;
            }
            else {
                left = left.next;
            }
        }

        if(!found){
            System.out.println("target not found!!!!");
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(15);
        Node b = new Node(40);
        Node c = new Node(55);
        Node tail = new Node(100);

        head.next=a;
        a.prev=head;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=tail;
        tail.prev=c;

        display(head);
        twoSumTarget(head, 115);
    }
}
