package LinkedList;

public class implementation {
    static Node head;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        while (head==null){
            head=newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public static class Node{
        int data;
        Node next;

        Node(int x){
            this.data=x;
        }
    }
    public static void main(String[] args) {
        head=new Node(7);
        head.next=new Node(11);
        head.next.next=new Node(5);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(17);

        //Traverse LL
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");

        //count size of LL
        int count=0;
        Node curr=head;
        while (curr!=null){
            count++;
            curr=curr.next;
        }
        System.out.println("Size of LL is: "+count);

        //calling addFirst function
        addFirst(3);
        Node result=head;
        while (result!=null){
            System.out.print(result.data+" -> ");
            result=result.next;
        }
        System.out.println("null");

        System.out.println("Size of LL is: "+count);

        //calling addLast function
        addLast(50);
        Node result2=head;
        while (result2!=null){
            System.out.print(result2.data+" -> ");
            result2=result2.next;
        }
        System.out.println("null");
    }
}
