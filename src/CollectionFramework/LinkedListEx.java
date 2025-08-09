package CollectionFramework;

public class LinkedListEx {
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
        LinkedListEx list = new LinkedListEx();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.size();
    }
}
