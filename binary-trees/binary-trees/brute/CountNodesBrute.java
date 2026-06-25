class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class CountNodesBrute {

    static int count(Node root) {

        if(root == null)
            return 0;

        return count(root.left)
                + count(root.right)
                + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        System.out.println(count(root));
    }
}