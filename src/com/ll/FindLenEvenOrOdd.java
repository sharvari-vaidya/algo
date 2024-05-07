package com.ll;

public class FindLenEvenOrOdd {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		FindLenEvenOrOdd ll = new FindLenEvenOrOdd();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node four = new Node(4);

		ll.head.next = second;
		second.next = third;
		third.next = four;

		ll.findLen();
	}

	private void findLen() {
		Node n = head;
		while (n != null && n.next != null) {
			n = n.next.next;
		}
		if (n == null) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
