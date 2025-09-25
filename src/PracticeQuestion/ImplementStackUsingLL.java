package PracticeQuestion;

public class ImplementStackUsingLL {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class stackLL{
        Node head = null;
        int size = 0;

        public void push(int x){
            Node newNode=new Node(x);
            newNode.next=head;
            head=newNode;
            size++;
        }

        public int pop(){
            if(head == null){
                System.out.println("Stack is empty!!");
                return -1;
            }
            int temp = head.val;
            head = head.next;
            return temp;
        }

        public int peek(){
            if(head == null){
                System.out.println("Stack is empty!!");
                return -1;
            }
            return head.val;
        }

        //helper function for display stack
        public void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        public void display(){
           displayRec(head);
           System.out.println();
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        stackLL st=new stackLL();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek()); // 4
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.isEmpty());
    }
}
