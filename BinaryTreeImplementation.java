package com.gl.datastructures;

import com.gl.datastructures.BinaryTreeLCA.Node;

public class BinaryTreeImplementation {

	public static void main(String[] args) {
		BinaryTreeLCA binaryTree= new BinaryTreeLCA();
		binaryTree.root= new Node(10);
		binaryTree.root.left = new Node(20);
		binaryTree.root.right= new Node(30);
		binaryTree.root.left.left = new Node(40);
		binaryTree.root.left.right= new Node(50);
		binaryTree.root.right.left= new Node(60);
		binaryTree.root.right.right= new Node(70);
		
		System.out.println("Least Common Ancestor (20, 30)"+ binaryTree.findLCA(20, 30));
		System.out.println("Least Common Ancestor (40, 30)"+ binaryTree.findLCA(40, 30));
		System.out.println("Least Common Ancestor (60, 70)"+ binaryTree.findLCA(60, 70));
		System.out.println("Least Common Ancestor (20, 40)"+ binaryTree.findLCA(20, 40));
		System.out.println("Least Common Ancestor (20, 80)"+ binaryTree.findLCA(20, 80));
	}

}
