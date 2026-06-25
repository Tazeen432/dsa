class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class MaximumDepth {

    static int depth(TreeNode root) {

        if(root == null)
            return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);

        System.out.println(depth(root));
    }
}