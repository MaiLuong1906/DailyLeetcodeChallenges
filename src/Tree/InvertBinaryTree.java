package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
//    public static TreeNode invertTree(TreeNode root) {
//        if(root == null) return null;
//
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//
//        invertTree(root.left);
//        invertTree(root.right);
//
//        return root;
//    }

    public static TreeNode invertTree(TreeNode root){
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if(node.left != null )queue.add(node.left);
            if(node.right != null)queue.add(node.right);
        }
        return root;
    }
}
