package BinarySearchTree;

public class DeleteNode {
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

    //for traversal and print
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //delete node
    public static Node delete(Node root, int val){
        if(root == null){
            return null;
        }

      if(root.data > val){
          root.left = delete(root.left, val);
      }
      else if (root.data < val) {
          root.right = delete(root.right, val);
      }
      else {
          //case1
          if(root.right == null && root.left == null){
              return null;
          }

          //case2
          if(root.left == null){
              return root.right;
          }
          else if (root.right == null) {
              return root.left;
          }

          //case3
          Node IS = inorderSuccessor(root.right);
          root.data = IS.data;
          root.right = delete(root.right, IS.data);
      }
      return root;
    }

    //find successor
    public static Node inorderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 101);
        inorder(root);
    }
}
