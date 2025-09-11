package BinaryTree;

public class LevelOrderNth {

                                    //Using Recursion + Height of Tree → Recursive

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

    //height of the tree
    public static int height(Node root){
        if(root == null){
            return -1;       //   - return -1 for null → height in terms of edges
                            //   - return  0 for null → height in terms of nodes
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    //print nth level elements
    public static void nthLevel(Node root, int level){     //print left to right
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.val+" ");
        }
        nthLevel(root.left, level-1);
        nthLevel(root.right, level-1);
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

        int level = height(root)+1;   //calculate level of tree

        for(int i=1; i<=level; i++){
            nthLevel(root, i);
            System.out.println();
        }
    }
}
