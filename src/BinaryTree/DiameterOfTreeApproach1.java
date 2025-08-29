package BinaryTree;

public class DiameterOfTreeApproach1 {
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

    //height of tree
    public static int heightTree(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }

   //diameter of tree
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }

        int diam1=Diameter(root.left);
        int diam2=Diameter(root.right);
        int diam3=heightTree(root.left)+heightTree(root.right)+1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(Diameter(root));
    }
}
