package com.gl.datastructures;

public class LinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next =null;
		}
	}
	
	public Node reverse(Node node) {
		Node previous =null;
		Node current = node;
		Node next =null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current =next;
		}
		node = previous;
		return node;
	}
	
	// display contents
	public void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}

}
