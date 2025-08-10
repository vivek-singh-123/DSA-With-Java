package LinkedList;

import java.util.LinkedList;

public class CollectionFrameworkLL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);

        System.out.println(list.size());

        //print
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        //remove first
        list.removeFirst();
        System.out.println(list);

        //remove last
        list.removeLast();
        System.out.println(list);

        //remove through index
        list.remove(1);
        System.out.println(list);
    }
}
