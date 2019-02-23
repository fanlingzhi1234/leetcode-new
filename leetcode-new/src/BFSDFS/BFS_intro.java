package BFSDFS;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.*;

import javax.annotation.Generated;

/**
* @author Rexus 
* @version Build Time：Feb 19, 2019 2:35:25 PM
* @Explain
*/
public class BFS_intro {

	int[][] maze = {
		    { 0, 1, 1, 0, 0 },
		    { 0, 0, 1, 1, 0 },
		    { 0, 1, 1, 1, 0 },
		    { 1, 0, 0, 0, 0 },
		    { 0, 0, 1, 1, 0 }
		};
	int visited[] = new int[maze.length+1];
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for (int i : visited) {
			visited[i] = 0;
		}
		for(int i = 0; i< maze.length; i++) {
			if(visited[i] == 0) {
				BFS(i);
			}
		}
		
	}
	// use queue;
	
	public void BFS(int start) {
		Queue Q = new LinkedList<Integer>();
		Q.add(start);
		visited[start] = 1;
		while(!Q.isEmpty()) {
			
		}
		
	}
	
	
	
	
	//use stack
	public void DFS(int start) {
		
	}

}
