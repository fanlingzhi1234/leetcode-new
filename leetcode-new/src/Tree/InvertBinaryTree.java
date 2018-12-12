package Tree;
/**
* @author Rexus 
* @version Build Time：Nov 19, 2018 9:53:57 PM
* @Explain
* 
* 226. Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
*/
public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TreeNode invertTree(TreeNode root) {
		if(root == null) return null;
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = invertTree(right);
		root.right = invertTree(left);
        
        return root;
    }

}
