class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class SearchInBSTOptimal {

    static boolean search(Node root,int key) {

        if(root == null)
            return false;

        if(root.data == key)
            return true;

        if(key < root.data)
            return search(root.left,key);

        return search(root.right,key);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        System.out.println(search(root,20));
    }
}