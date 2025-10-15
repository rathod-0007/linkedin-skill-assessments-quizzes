/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean isSubtreeFound = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    boolean isSameTree(TreeNode nodeA, TreeNode nodeB) {
        if (nodeA == null && nodeB == null) {
            return true;
        }

        if (nodeA == null || nodeB == null) {
            return false;
        }

        return nodeA.val == nodeB.val && isSameTree(nodeA.left, nodeB.left) && isSameTree(nodeA.right, nodeB.right);
    }
}
