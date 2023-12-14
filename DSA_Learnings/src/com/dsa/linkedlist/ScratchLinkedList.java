package com.dsa.linkedlist;



class Node {
	String data;
	Node next;

	Node(String data) {

		this.data = data;
		this.next = null;

	}
}

public class ScratchLinkedList {

	static Node head;
	

	
	public static void addFirst(String data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
		
	}
	
	public static void addLast(String data) {
		
		
		if(head == null) {
			
			head = new Node(data);
			return;
		}
		
		Node currentNode = head;
		
		while(currentNode.next != null) {
			
			currentNode = currentNode.next;
		}
		
		currentNode.next = new Node(data);
		
	}
	
	public static void print() {
		
		Node currentNode = head;
		
		while(currentNode!=null) {
			
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}
	


	public static void main(String[] args) {
		
		ScratchLinkedList.addFirst("Thousif");
		ScratchLinkedList.addLast("Khan");
		ScratchLinkedList.print();
	}
}
