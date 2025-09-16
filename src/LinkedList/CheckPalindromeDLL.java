package LinkedList;

public class CheckPalindromeDLL {
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

    //check palindrome
    public static boolean checkPalindrome(Node head){
        if(head == null) return true;
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        
        Node left = head;
        Node right = tail;

        while (left != right && left.prev != right){
            if (left.val != right.val) return false;
            left = left.next;
            right = right.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(2);
        Node tail = new Node(1);

        head.next=a;
        a.prev=head;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=tail;
        tail.prev=c;

        display(head);
        boolean result = checkPalindrome(head);
        System.out.println(result);
    }
}
