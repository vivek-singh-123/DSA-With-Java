package BinarySearchTree;

public class SearchBST {
    //Node class
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
        }
    }

    //insert function
    public static Node insert(Node root, int val){
        if(root == null){
            root=new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    //search key
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            return search(root.left, key);
        }
        else if (root.data == key) {
            return true;
        }else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int[] values={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        if(search(root,11)){
            System.out.println("found");
        }else {
            System.out.println("not found!");
        }
    }
}
