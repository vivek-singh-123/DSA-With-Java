package BinaryTree;

public class CountOfNodes {
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

    //count nodes number
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);
        return leftNode+rightNode+1;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(countNodes(root));
    }
}
