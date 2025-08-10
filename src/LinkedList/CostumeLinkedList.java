package LinkedList;

public class CostumeLinkedList {
    Node head;

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //delete - first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty!");
        }
        head=head.next;
    }

    //delete - last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty!");
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
         secondLast.next=null;
    }

    //print
    public void printList() {
        if (head == null) {
            System.out.print("List is empty!");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


    //count
    public void size(){
        int count=0;
        Node currNode=head;
        while (currNode != null){
            count++;
            currNode=currNode.next;
        }
        System.out.println("Size of list is: "+count);
    }

    public static void main(String[] args) {
        CostumeLinkedList list = new CostumeLinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.size();
        list.addFirst("this");
        list.printList();
        list.size();
    }
}
