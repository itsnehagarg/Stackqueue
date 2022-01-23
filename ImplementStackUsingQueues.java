package com.gl.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ImplementStackUsingQueues {
	
	Queue<Integer> queue;
	Queue<Integer> tempQueue;
	
	ImplementStackUsingQueues(){
		queue = new LinkedList<Integer>();
		tempQueue= new LinkedList<Integer>();
	}
	
	
	//Stack -> push
	public void push(Integer data) {
		if(queue.size()==0) {
			queue.add(data);
		}else {
			int size = queue.size();
			//move elements from queue to tempQueue
			for(int i=0; i<size;i++) {
				tempQueue.add(queue.remove());
			}
			
			//enqueue the element into queue
			queue.add(data);
			
			//move elments from tempQueue to queue
			for(int i=0; i<size; i++) {
				queue.add(tempQueue.remove());
			}
		}
	}
	
	//pop
	
	public Integer pop() {
		if(queue.size()==0) {
			throw new NoSuchElementException();
		}
		return queue.remove();
	}
	
	//isEmpty
	public boolean isEmpty() {
		return queue.size()==0;
	}
	
	//size
	public int getSize() {
		return queue.size();
	}
	
	//print
	public void print (){
		System.out.println("Stack");
		int size = getSize();
		if(size==0) {
			System.out.println("STack is empty");
		}else {
			Iterator itr= queue.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next() + " ");
				System.out.println();
			}
		}
	}
	
}
