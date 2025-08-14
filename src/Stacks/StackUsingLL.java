package Stacks;

public class StackUsingLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data; //since there are two data variables so, there were a chance to have the confusion
            this.next=null;  //to avoid that confusion(ambiguity), that's why we are using 'this' keyword
        }
    }

    public static class Stack{
        private static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode=new Node(data);

            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            Node temp = head.next; //temp ko head.next pr bhej rhe hai bcz connection todna hai, ak baar connect tut
                                   // jaye to aage jane ka rasta band ho jaye
            int top = head.data;
            head.next=null;
            head=temp;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
    }


    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
