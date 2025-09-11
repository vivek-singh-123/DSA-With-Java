package BinaryTree;

public class ZigZagLevelOrder {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }
    public static int height(Node root){
        if(root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void oddNthLevel(Node root, int level){
        if(root == null) return;

        if(level == 1){
            System.out.print(root.val+" ");
        }
        oddNthLevel(root.left, level-1);
        oddNthLevel(root.right, level-1);
    }
    public static void evenNthLevel(Node root, int level){
        if(root == null) return;

        if(level == 1){
            System.out.print(root.val+" ");
        }
        evenNthLevel(root.right, level-1);
        evenNthLevel(root.left, level-1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;

        int level = height(root);  //height of tree

        for(int i=1; i<=level; i++){
            if(i%2 != 0){
                oddNthLevel(root,i);
                System.out.println();
            }else {
                evenNthLevel(root,i);
                System.out.println();
            }
        }
    }
}
