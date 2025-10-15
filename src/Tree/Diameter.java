package Tree;

public class Diameter {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }
    public int dfs(TreeNode root, int[] res) {
        if(root == null) return 0;

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);

        res[0] = Math.max(res[0], left+right);

        return Math.max(left, right)+1;
    }
}
