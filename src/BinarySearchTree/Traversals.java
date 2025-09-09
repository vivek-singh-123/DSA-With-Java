package BinarySearchTree;

public class Traversals {
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

    //preorder traversal
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //postorder function
    public static void postorder(Node root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //inorder traversal
    public static void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] values={10,5,15,2,8,12,17};   //arbitrary array of values
        Node root=null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        System.out.println("preorder:-");
        preorder(root);

        System.out.println();
        System.out.println("postorder:-");
        postorder(root);

        System.out.println();
        System.out.println("inorder:-");
        inorder(root);             //inorder traversal of a BST always prints values in ascending sorted order!!!!!!!
    }
}
