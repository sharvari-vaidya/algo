package com.ll;

import com.ll.DeletionFromLL.Node;

public class IntersectionOfTwoSortedList {

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
		IntersectionOfTwoSortedList l1 = new IntersectionOfTwoSortedList();
		l1.head = new Node(1);
		Node three = new Node(3);
		Node five = new Node(5);
		Node seven = new Node(7);

		l1.head.next = three;
		three.next = five;
		five.next = seven;

		IntersectionOfTwoSortedList l2 = new IntersectionOfTwoSortedList();
		l2.head = new Node(2);
		Node four = new Node(4);
		Node six = new Node(6);
		Node eight = new Node(8);

		l2.head.next = four;
		four.next = six;
		six.next = eight;

		IntersectionOfTwoSortedList l3 = new IntersectionOfTwoSortedList();
		l3.head = null;
		l1.findIntersectionOfTwoList(l1.head, l2.head, l3.head);

		l3.print(l3.head);
	}

	private void findIntersectionOfTwoList(Node headl1, Node headl2, Node ans) {
		if (headl1 == null || headl2 == null) {
			return;
		}
		if (headl1.data > headl2.data) {
			if (ans == null) {
				ans = headl1;

			}
			findIntersectionOfTwoList(headl1, headl2.next, ans.next);

		} else {

			findIntersectionOfTwoList(headl1.next, headl2, ans.next);
		}
		while (headl1 != null) {

		}

	}

	public void print(Node headnew) {
		Node n = headnew;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println("***********");
	}

}
