package PracticeQuestion;

public class ImplementStackUsingArray {
    public static void main(String[] args) {
        stackArray st=new stackArray();

        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println();
        System.out.println(st.isFull());
        st.push(10);
    }
    public static class stackArray{
       int[] arr=new int[3];
       int idx = 0;

       public void push(int val){
           if(isFull()){
               System.out.println("stack is full");
               return;
           }
           arr[idx] = val;
           idx++;
       }

       public int peek(){
           if(idx == 0){
               System.out.println("stack is empty!!!!!!");
               return -1;
           }
           return arr[idx-1];
       }

       public int pop(){
           if(idx == 0){
               System.out.println("stack is empty!!!!!!");
               return -1;
           }
           int top = arr[idx-1];
           arr[idx-1] = 0;
           idx--;
           return top;
       }

       public void display(){
           for(int i=idx-1; i>=0; i--){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
       }

       public int size(){
           return idx;
       }

       public boolean isEmpty(){
           if(idx == 0) return true;
           else return false;
       }

       public boolean isFull(){
           if(arr.length == idx) return true;
           else  return false;
       }
    }
}
