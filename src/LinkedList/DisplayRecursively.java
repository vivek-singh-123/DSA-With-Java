package LinkedList;

public class DisplayRecursively {

    public static int length(Node head){
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    //recursive approach
    public static void displayRecursive(Node head){
        if(head==null){
            return;
        }

        displayRecursive(head.next);  //print reverse
        System.out.print(head.data+" ");
        //displayRecursive(head.next);
    }

    //Iterative approach
    public static void display(Node head){
        while (head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
           // this.next=null;
        }
    }
    public static void main(String[] args) {
       Node head=new Node(2);
       head.next=new Node(3);
       head.next.next=new Node(5);
       head.next.next.next=new Node(8);
       head.next.next.next.next=new Node(15);

       Node temp=head;
       while (temp!=null){
           System.out.print(temp.data+" -> ");
           temp=temp.next;
       }
        System.out.println("null");

       //calling function
       display(head);

       //calling recursive function
       displayRecursive(head);

       //calling function for checking size of LL
        System.out.println();
        System.out.println("Size of LL is: "+length(head));
    }
}
