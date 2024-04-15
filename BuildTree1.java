public class BuildTree1 {

    public static TreeNode getTree() {

        TreeNode root = new TreeNode(3);        

        TreeNode left1 = new TreeNode(4);        
        left1.left = new TreeNode(1);
        left1.right = new TreeNode(2);

        root.left = left1;
        root.right =  new TreeNode(5);
        
        return root;

    }
}