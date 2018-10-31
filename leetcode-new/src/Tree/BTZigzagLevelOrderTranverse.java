package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 103. Binary Tree Zigzag Level Order Traverse
 * @author Reuxs
 *
 *
 *
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */

public class BTZigzagLevelOrderTranverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		Deque<TreeNode> deque = new ArrayDeque<>();
		if(root != null) deque.add(root);
		int pop_num = deque.size();
		List<List<Integer>> result = new ArrayList<>();
		boolean dir = true;
		while(!deque.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			for(int i =0; i < pop_num; i++) {
				TreeNode temp = null;
				if(dir) {
					temp = deque.pollFirst();
					if(temp.left != null)
						deque.addLast(temp.left);
					if(temp.right != null)
						deque.addLast(temp.right);
				}
				else {
					temp = deque.poll();
					if(temp.right != null)
						deque.addFirst(temp.right);
					if(temp.left != null)
						deque.addFirst(temp.left);
				}
				level.add(temp.val);
			}
			result.add(level);
			pop_num = deque.size();
			dir =  !dir;
		}
		
		return result;
	}
	
	
	/*
	 * Deque<TreeNode> dq = new ArrayDeque<>();
        if (root != null) dq.add(root);
        int pop_num = dq.size();
        List<List<Integer>> res = new ArrayList<>();
        boolean dir = true;
        while (!dq.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < pop_num; ++i) {
                TreeNode tmp = null;
                if (dir) {
                    tmp = dq.pollFirst();
                    if (tmp.left != null) dq.addLast(tmp.left);
                    if (tmp.right != null) dq.addLast(tmp.right);
                } else {
                    tmp = dq.pollLast();
                    if (tmp.right != null) dq.addFirst(tmp.right);
                    if (tmp.left != null) dq.addFirst(tmp.left);
                }
                level.add(tmp.val);
            }
            res.add(level);
            pop_num = dq.size();
            dir = !dir;
        }
        return res;
	 */

}
