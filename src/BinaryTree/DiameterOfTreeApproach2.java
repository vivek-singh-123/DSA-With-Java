package BinaryTree;

import com.sun.source.tree.Tree;

public class DiameterOfTreeApproach2 {
    //node class
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinaryTree{

        static int idx = -1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }

    public static class TreeInfo{
            int ht;
            int diam;

            TreeInfo(int ht, int diam){
                this.ht=ht;
                this.diam=diam;
            }
    }

    public static TreeInfo diameter(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myHeight = Math.max(left.ht, right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3= left.ht+right.ht+1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(diameter(root).diam);
    }
}
