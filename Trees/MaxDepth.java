import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxDepth {

    // Build Tree
    public static TreeNode buildTree() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter root (-1 for NULL): ");
        int value = sc.nextInt();

        if (value == -1)
            return null;

        TreeNode root = new TreeNode(value);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            System.out.print("Enter left child of " + current.val + " (-1 for NULL): ");
            int left = sc.nextInt();

            if (left != -1) {
                current.left = new TreeNode(left);
                queue.offer(current.left);
            }

            System.out.print("Enter right child of " + current.val + " (-1 for NULL): ");
            int right = sc.nextInt();

            if (right != -1) {
                current.right = new TreeNode(right);
                queue.offer(current.right);
            }
        }

        return root;
    }

    // Solution
    public static int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Driver Code
    public static void main(String[] args) {

        TreeNode root = buildTree();

        int ans = maxDepth(root);

        System.out.println("\nMaximum Depth = " + ans);
    }
}