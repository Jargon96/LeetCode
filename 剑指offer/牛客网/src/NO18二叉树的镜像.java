
public class NO18二叉树的镜像 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	    
	    public static void Mirror(TreeNode root) {
	        if(root!=null){
		        TreeNode p;
		        p=root.left;
		        root.left=root.right;
		        root.right=p;
		        Mirror(root.left);
		        Mirror(root.right);
	        }
	    }

	public static void main(String[] args) {
		

	}

}
