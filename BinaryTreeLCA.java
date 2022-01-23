package com.gl.datastructures;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLCA {
	
	Node root;
	static class Node{
		int data;
		Node left, right;
		
		Node(int value){
			data = value;
			left = right =null;
		}
	}
	// determine the paths where we find the node values
	// then compare and find the LCA
	public int findLCA(int node1, int node2) {
		List path1= new ArrayList();
		if(!findPath(root, node1, path1)) {
			System.out.println("node1 is not present");
			return -1;
		}
		List path2= new ArrayList();
		if(!findPath(root, node2, path2)) {
			System.out.println("node2 is not present");
			return -1;
		}
		int i;
		for(i=0; i<path1.size() && i<path2.size();i++) {
			if(!path1.get(i).equals(path2.get(i))){
				break;
			}
		}
		return (int) path1.get(i-1);
	}
	
	public boolean findPath(Node root, int n, List<Integer> path) {
		//base case
		if(root==null)
		{
			return false;
		}
		path.add(root.data);
		
		if(root.data==n) {
			return true;
		}
		
		if(root.left!=null && findPath(root.left, n, path)) {
			return true;
		}
		
		if(root.right !=null && findPath(root.right, n, path)) {
			return true;
		}
		//remove root from path and return false
		
		path.remove(path.size()-1);
		
		return false;
		
	}

}
