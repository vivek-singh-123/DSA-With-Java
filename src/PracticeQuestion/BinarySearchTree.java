package PracticeQuestion;

public class BinarySearchTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static class BST{
        //build tree
        public Node insert(Node root, int val){
            if(root == null){
                root=new Node(val);
                return root;
            }
            if(val < root.val){
                root.left = insert(root.left, val);
            }
            else if(val > root.val){
                root.right = insert(root.right, val);
            }
            return root;
        }

        //search a node
        public boolean search(Node root, int target){
            if(root == null) return false;

            if(target == root.val) return true;
            if(target > root.val) return search(root.right, target);
            else return search(root.left, target);

        }

        //delete node
        public Node delete(Node root, int target){
            if(root == null) return null;

            if(target < root.val){
                root.left = delete(root.left, target);
            }
            else if(target > root.val){
                root.right = delete(root.right, target);
            }else {
                //case 1
                if(root.left == null && root.right == null){
                    return null;
                }
                //case 2
                if(root.left == null){
                    return root.right;
                }
                if(root.right == null){
                    return root.left;
                }
                //case 3
                Node IS = inOrderSuccessor(root.right);
                root.val = IS.val;
                root.right = delete(root.right, IS.val);
            }
            return root;
        }
        //inorder successor
        public Node inOrderSuccessor(Node root){
            while (root.left != null){
                root = root.left;
            }
            return root;
        }

        //height of tree
        public int height(Node root){
            if(root == null) return -1;

            return 1 + Math.max(height(root.left), height(root.right));
        }

        //Check if a binary tree is a BST
        public boolean helper(Node root, Node min, Node max){
            if(root == null) return true;

            if(min != null && root.val <= min.val) return false; //minimum null nhi hona chahiye
            else if(max != null && root.val >= max.val) return false;

            return helper(root.left, min, root) && helper(root.right, root, max);
        }
        public boolean isBST(Node root){
            return helper(root, null, null);
        }

        //preorder traversal
        public void preOrder(Node root){
            if(root == null) return;

            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        //inorder traversal
        public void inOrder(Node root){
            if(root == null) return;

            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
        //postorder traversal
        public void postOrder(Node root){
            if(root == null) return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
    }
    public static void main(String[] args) {
        BST bst=new BST();
        int[] arr = {7,30,50,35,20,5};
        Node root = null;
        for(int num : arr){
            root = bst.insert(root, num);
        }

        //preorder
        bst.preOrder(root);
        System.out.println();
        //inorder
        bst.inOrder(root);
        System.out.println();
        //postorder
        bst.postOrder(root);
        System.out.println();

        //search
        if(bst.search(root, 10)){
            System.out.println("found");
        }else {
            System.out.println("not found!!");
        }
        //delete
        root  = bst.delete(root, 35);
        bst.inOrder(root);
        System.out.println();

        //height
        int height = bst.height(root);
        System.out.println(height);

        //is BST ?
        System.out.println(bst.isBST(root));
    }
}
