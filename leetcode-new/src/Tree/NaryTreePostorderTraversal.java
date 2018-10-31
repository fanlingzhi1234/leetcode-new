package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 590. N-ary PostOrder Traverse
 * @author Reuxs
 *
 *
 *Given an n-ary tree, return the postorder traversal of its nodes' values.

For example, given a 3-ary tree:

 



 

Return its postorder traversal as: [5,6,3,2,4,1].


 */


public class NaryTreePostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> aList = new ArrayList<>();
	
	public List<Integer> postorder(Node root) {
		//left,right,add;
		
		if(root == null) return null;
		for(Node child : root.children) {
			if(child != null) {
				
			}
		}
		
		
		return aList;
        
    }
	public List<Integer> postorder2(Node root) {
		//6ms
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        postorder2(root, list);
        return list;
    }

    private void postorder2(Node root, List<Integer> list) {
        if (root == null) return;
        for (Node child : root.children) {
            postorder2(child, list);
        }
        list.add(root.val);
    }
    public List<Integer> postorder3(Node root) {
    	//9ms
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for(Node node: root.children)
                stack.add(node);
        }
        Collections.reverse(list);
        return list;
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
