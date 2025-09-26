package PracticeQuestion;

public class ImplementSinglyLinkedList {
    //Node class
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    //LL class
    public static class LL{
        Node head;

        //insert at first
        public void addFirst(int x){
            Node newNode=new Node(x);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head=newNode;
        }


        //insert at end
        public void addLast(int x){
            Node newNode=new Node(x);
            if(head == null){
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next=newNode;
        }

        //insert at kth position
        public void addKthPosition(int x, int idx){
            Node newNode=new Node(x);
            if(head == null && idx == 1){
                newNode.next = head;
                head = newNode;
                return;
            }
            if(idx == 1){
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for(int i=1; i<idx-1; i++){
                if(temp == null){
                    System.out.println("idx out of bound");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        //delete first node
        public Node deleteFirst(){
            if(head == null){
                System.out.println("LL is empty!!!");
                return null;
            }
            Node deleted = head;
            head = head.next;
            return deleted;
        }

        //delete last node
        public Node deleteLast(){
            if(head == null){
                System.out.println("LL is empty!!!");
                return null;
            }
            if(head.next == null){
                Node deleted = head;
                head = null;
                return deleted;
            }
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            Node deleted = temp.next;
            temp.next = null;
            return deleted;
        }

        // Delete node at given position
        public Node deleteKthPosition(int idx){
            if(head == null){
                System.out.println("LL is empty!!!");
                return null;
            }
            if(idx == 1){
                Node deleted = head;
                head = head.next;
                return deleted;
            }

            Node temp = head;
            for(int i=1; i<idx-1; i++){
                if(temp.next == null){
                    System.out.println("index out of bound!!!");
                    return null;
                }
                temp = temp.next;
            }

            if(temp.next == null){
                System.out.println("index out of bound");
                return null;
            }

            Node deleted = temp.next;
            temp.next = temp.next.next;
            return deleted;
        }

        //display LL
        public void display(){
            if(head == null){
                System.out.println("LL is empty!");
                return;
            }

            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LL list=new LL();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(50);
        list.addKthPosition(100, 4);

        list.display();
    }
}
