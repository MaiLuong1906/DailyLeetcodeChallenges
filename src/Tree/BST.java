package Tree;

public class BST {
    TreeNode mRoot = new TreeNode();

//    public TreeNode insert(TreeNode root, int val){
//        TreeNode newNode = new TreeNode(val);
//        if(root == null) {
//            root = newNode;
//            return root;
//        }
//        else{
//            TreeNode tmp = root;
//            while(true){
//                if(tmp.val > val){
//                    if(tmp.left == null){
//                        tmp.left = newNode;
//                        break;
//                    }
//                    else{
//                        tmp = tmp.left;
//                    }
//                }
//                else{
//                    if(tmp.right == null){
//                        tmp.right = newNode;
//                        break;
//                    }
//                    else{
//                        tmp = tmp.right;
//                    }
//                }
//            }
//            return root;
//        }
//    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }

    public TreeNode findLeftMostNode(TreeNode root){
        if(root == null) return null;
        TreeNode leftMostNode = root;
        while(leftMostNode.left != null){
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }

    public TreeNode delete(TreeNode root, int val){
        if(root == null) return null;
        else{
            if(val < root.val){
                root.left = delete(root.left, val);
            }
            else if(val > root.val){
                root.right = delete(root.right, val);
            }
            else{
                if(root.left == null && root.right == null)
                    return null;
                if (root.left != null && root.right == null)
                    return root.left;
                if (root.left == null && root.right != null)
                    return root.right;
                TreeNode leftMostNode = findLeftMostNode(root.right);
                root.val = leftMostNode.val;
                root.right = delete(root.right, leftMostNode.val);
            }
            return root;
        }
    }

    public TreeNode search(TreeNode root, int val){
        if(root == null) return null;
        if(val > root.val){
            return search(root.right, val);
        }
        else if(val < root.val){
            return search(root.left, val);
        }
        else{
            return root;
        }
    }

    public void preOrder(TreeNode root){
        if(root == null) return;
        System.out.println(root.val +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOder(TreeNode root){
        if(root == null) return;
        inOder(root.left);
        System.out.println(root.val + " ");
        inOder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val + " ");
    }
}
