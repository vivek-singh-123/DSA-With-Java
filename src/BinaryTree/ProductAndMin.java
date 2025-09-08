package BinaryTree;

public class ProductAndMin {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
            left=null;
            right=null;
        }
    }

    //min of tree
    public static int min(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    //product of tree
    public static long product(Node root){
        if(root == null){
            return 1;
        }

        return root.val * product(root.left) * product(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(7);
        Node A=new Node(8);
        Node B=new Node(5);
        root.left=A;
        root.right=B;
        Node C=new Node(6);
        Node D=new Node(3);
        A.left=C;
        A.right=D;
        Node E=new Node(2);
        Node F=new Node(4);
        B.left=E;
        B.right=F;

        System.out.println("min value of tree: " + min(root));
        System.out.println("product of tree: " + product(root));
    }
}
