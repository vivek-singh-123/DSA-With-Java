package LinkedList;

public class InsertNodeAtKthPosition {
    static Node head;  //global variable
    public static class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
    }

    //add value at Kth position
    public void addKthPosition(int p, int val){
        Node newNode=new Node(val);

        if(head == null && p==1){
            head=newNode;
            return;
        }

        if(head == null){
            System.out.println("LL is empty!");
            return;
        }

        if(p==1){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node temp=head;

        for (int i=1; i<p-1; i++){ //no indexing over here. hm yha temp pointer kth-1 position ke node pr bhej kr baitha rhe hai
            if(temp.next == null){
                System.out.println("position is out of bound!!");
                return;
            }
            temp=temp.next;
        }

        //nye node se excisting LL me se temp node ke aage ke node ko pakdwa lete hai bcz jb temp nye node ko pakdega to temp ke aage k jo list thi vo connected milegi
        newNode.next=temp.next;// equal ke pehle ki pointer se equal ke baad ke object ko pakda jata h.
        temp.next=newNode;
    }

    //display
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty!!");
            return;
        }

        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        InsertNodeAtKthPosition f=new InsertNodeAtKthPosition();
        f.display();
        f.addKthPosition(3,60);
        f.display();

    }
}
