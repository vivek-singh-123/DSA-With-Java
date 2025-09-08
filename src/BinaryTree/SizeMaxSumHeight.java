package BinaryTree;

public class SizeMaxSumHeight {
    //Node class
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    //find size of tree
    public static int size(Node root){
        if(root == null){
            return 0;
        }

        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return leftSize+rightSize+1;
    }

    //find sum of tree
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        return root.data + sum(root.left) + sum(root.right);
    }

    //find max node of tree
    public static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    //height of the tree
    public static int height(Node root){
        if(root == null){
            return -1;       //   - return -1 for null → height in terms of edges
                            //   - return  0 for null → height in terms of nodes
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(20);
        Node b=new Node(300);
        root.left=a;
        root.right=b;
        Node c=new Node(40);
        Node d=new Node(-50);
        a.left=c;
        a.right=d;
        Node e=new Node(60);
        Node f=new Node(70);
        b.right=e;
        b.left=f;

        System.out.println("Size of tree(no. of nodes present): "+size(root));
        System.out.println("Sum of tree: "+sum(root));
        System.out.println("Maximum of tree: "+max(root));
        System.out.println("Height in terms of edges: "+height(root));
    }
}
