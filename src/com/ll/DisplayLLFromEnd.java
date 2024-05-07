package com.ll;

public class DisplayLLFromEnd {

	Node head;
	int len;

	static class Node {
		Node prev;
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static void main(String[] args) {
		DisplayLLFromEnd dd = new DisplayLLFromEnd();
		dd.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		dd.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		dd.display(dd.head);

	}

	private void display(Node head2) {
		if (head2 == null) {
			return;
		}
		display(head2.next);
		System.out.println(head2.data);

	}

}
