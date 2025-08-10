package Stack_And_Queue;

import java.util.Stack;

public class CollectionFrameworkStack {
    public static void main(String[] args) {
        Stack<Integer> list=new Stack<>();
        list.push(11);
        list.push(21);
        list.push(31);
        list.push(41);
        list.push(51);

        while (!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
