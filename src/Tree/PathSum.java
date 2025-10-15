package Tree;

public class PathSum {
    public boolean pathSum(TreeNode root, int target){
        return traversal(root, 0, target);
    }

    public boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }

    public boolean traversal(TreeNode root, int sum, int target){
        if(root == null) return false;

        sum += root.val;
        if(isLeaf(root)) {
            return sum == target;
        }

        boolean left = traversal(root.left, sum, target);
        boolean right = traversal(root.right, sum, target);

        return left || right;
    }
}
