package PracticeQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    //binary tree class
    public static class customBt{
        //preorder traverse
        public void preOrder(Node root){
            if(root == null) return;

            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        //inorder traverse
        public void inOrder(Node root){
            if(root == null) return;

            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
        //postorder traverse
        public void postOrder(Node root){
            if(root == null) return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
        //level order traversal
        public void levelOrder(Node root){
            if(root == null) return;

            Queue<Node> q=new LinkedList<>();
            if(root != null){
                q.offer(root);
            }
            while (!q.isEmpty()){
                Node temp = q.peek();
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
                System.out.print(temp.val+" ");
                q.poll();
            }
        }
        //height of tree
        public int height(Node root){
            if(root == null) return -1;

            return 1 + Math.max(height(root.left), height(root.right));
        }
        //count nodes of binary tree
        public int countNode(Node root){
            if(root == null) return 0;

            return 1 + countNode(root.left) + countNode(root.right);
        }
        //count leaf nodes
        public int leafNodes(Node root){
            if(root == null) return 0;

            if(root.left == null && root.right == null){
                return 1;
            }

            return leafNodes(root.left) + leafNodes(root.right);
        }
        //check if binary tree is balanced
        public boolean isBalanced(Node root){
            if (root == null) return true;

            int lefSubTree = height(root.left);
            int rightSubTree = height(root.right);
            if(Math.abs(lefSubTree - rightSubTree) >= 2) return false;

            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        a.left=b;
        a.right=c;
        Node d=new Node(40);
        Node e=new Node(50);
        b.left=d;
        b.right=e;
        Node f=new Node(60);
        Node g=new Node(70);
        c.left=f;
        c.right=g;

        customBt bt=new customBt();
        bt.preOrder(a);
        System.out.println();
        bt.inOrder(a);
        System.out.println();
        bt.postOrder(a);
        System.out.println();
        bt.levelOrder(a);
        System.out.println();

        int height = bt.height(a);
        System.out.println(height);

        int totalNodes = bt.countNode(a);
        System.out.println(totalNodes);

        int leafNodes = bt.leafNodes(a);
        System.out.println(leafNodes);

        System.out.println(bt.isBalanced(a));

    }
}
