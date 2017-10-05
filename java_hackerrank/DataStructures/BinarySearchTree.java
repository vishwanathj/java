import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        public Node(int k) {
            key = k;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {root = null;}

    void insert(int key){
        root = insertRecursively(root, key);
    }

    Node insertRecursively(Node root, int key){
        if(root == null) {
            root = new Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insertRecursively(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursively(root.right, key);
        }
        return root;
    }

    void delete(int key){
        root = deleteRecursively(root, key);
    }

    int minValue(Node root) {
        int minval = root.key;
        while(root.left != null){
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    Node deleteRecursively(Node root, int key){
        if (root == null) return root;

        if(key < root.key)
            root.left = deleteRecursively(root.left, key);
        else if(key > root.key)
            root.right = deleteRecursively(root.right, key);
        else
        {
            // case of node with one or no child
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            //case of node with 2 children, get the smallest node in the
            //right subtree and place it in the spot of deleted node
            root.key = minValue(root.right);
            root.right = deleteRecursively(root.right, root.key);
        }
        return root;
    }

    int height(){
        return heightRecursive(root);
    }

    int heightRecursive(Node root){
        if(root == null)
            return 0;
        else {
            int lh = heightRecursive(root.left);
            int rh = heightRecursive(root.right);
            if(lh > rh)
                return lh+1;
            else
                return rh+1;
        }
    }

    void levelorder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.key+" ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }

    void inorder(){
        inorderRecursive(root);
    }

    void inorderRecursive(Node root){
        if (root != null){
            inorderRecursive(root.left);
            System.out.print(root.key+" ");
            inorderRecursive(root.right);
        }
    }

    void preorder() {
        preorder(root);
    }

    void preorder(Node root){
        if (root != null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder() {
        postorder(root);
    }

    void postorder(Node root){
        if (root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        bst.insert(6);
        bst.insert(8);
        bst.inorder();
        System.out.println("inorder done");
        /*bst.preorder();
        System.out.println("preorder done");
        bst.postorder();
        System.out.println("postorder done");*/
        bst.levelorder();
        System.out.println("level order done");
        bst.delete(5);
        bst.inorder();
    }
}
