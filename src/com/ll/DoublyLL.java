package com.ll;

public class DoublyLL {
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
		DoublyLL dd = new DoublyLL();
		dd.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		dd.head.next = second;
		second.next = third;
		third.next = fourth;

		second.prev = dd.head;
		third.prev = second;
		fourth.prev = third;

		dd.printList();
		dd.insertElemnt(0, 1);// insert at the begining
		dd.printList();
		dd.insertElemnt(5, 6);// insert at the end
		dd.printList();
		dd.insertElemnt(-1, 3);// insert the element in the middle
		dd.printList();

		dd.deleteElement(7);
		dd.printList();

	}

	private void printList() {
		int cou = 0;
		Node n = head;
		while (n != null) {

			System.out.print(n.data);
			if (n.prev != null)
				System.out.print(" Prev data :: " + n.prev.data);
			if (n.next != null)
				System.out.print(" Next data :: " + n.next.data);
			System.out.println();
			n = n.next;
			cou++;

		}
		len = cou;
		System.out.println("Length :: " + len);
		System.out.println("*********");

	}

	private void insertElemnt(int value, int pos) {
		if (pos > len + 1) {
			System.out.println("Enter valid position!!");
			return;
		}
		Node newNode = new Node(value);
		Node n = head;
		if (pos == 1) {
			len++;
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		} else if (len + 1 == pos) {
			while (n.next != null) {
				n = n.next;
			}
			newNode.prev = n;
			n.next = newNode;
		} else {
			for (int i = 1; i < pos; i++) {
				n = n.next;
			}
			newNode.next = n;
			newNode.prev = n.prev;
			n.prev.next = newNode;
			n.prev = newNode;

		}
	}

	private void deleteElement(int pos) {
		if (pos > len + 1) {
			System.out.println("Enter valid position!!");
			return;
		}
		Node n = head;
		if (pos == 1) {
			head = n.next;
			n.next = null;
			head.prev = null;
		} else if (pos == len) {
			while (n.next != null) {
				n = n.next;
			}

			n.prev.next = null;
			n.prev = null;

		} else {
			for (int i = 1; i < pos; i++) {
				n = n.next;
			}
			Node prev = n.prev;
			prev.next = n.next;
			n.next.prev = prev;

		}

	}
}
