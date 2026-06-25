class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class InsertInBST {

    static Node insert(Node root,int value) {

        if(root == null)
            return new Node(value);

        if(value < root.data)
            root.left = insert(root.left,value);

        else if(value > root.data)
            root.right = insert(root.right,value);

        return root;
    }

    static void inorder(Node root) {

        if(root != null) {

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root,10);
        root = insert(root,5);
        root = insert(root,20);
        root = insert(root,15);

        inorder(root);
    }
}