package LinkedList;

public class DeleteKthElementFromStart {
    static Node head;
    public static class Node{
        int val;
        Node next;

        Node(int x){
            val=x;
            next=null;
        }
    }

    //delete kth element from start
    public void deleteKthEl(int n){
        if(head == null){
            System.out.println("LL is empty!");
            return;
        }

        if (n==1){
            head=head.next;
            return;
        }

        Node temp=head;
        for (int i=1; i<n-1; i++){
            if(temp == null || temp.next == null){
                System.out.println("position is out of index");
                return;
            }
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    //display
    public void display(){
        if(head==null){
            System.out.println("LL is empty!");
            return;
        }

        Node temp=head;

        while (temp != null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        head=new Node(11);
        head.next=new Node(13);
        head.next.next=new Node(5);
        head.next.next.next=new Node(17);
        head.next.next.next.next=new Node(21);

        DeleteKthElementFromStart d=new DeleteKthElementFromStart();
        d.display();
        d.deleteKthEl(3);
        d.display();

    }
}
