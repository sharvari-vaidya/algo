package A11.Date21Apr24.LLAdvance;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElements {

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
		FindUniqueElements ll = new FindUniqueElements();
		ll.head = new Node(5);
		Node sec = new Node(2);
		Node third = new Node(2);
		Node fourth = new Node(3);
		Node fifth = new Node(5);
		Node w = new Node(5);
		Node r = new Node(25);
		Node d = new Node(5);
		Node c = new Node(4);
		Node v = new Node(1);
		Node u = new Node(5);
		ll.head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = w;
		w.next = r;
		r.next = d;
		d.next = c;
		c.next = v;
		v.next = u;

		ll.findUniqueElemnt();

		ll.findDuplicateTwoLoop();
		ll.printAndfindLength();
	}

	private void findDuplicateTwoLoop() {

		Node curr = head;
		while (curr != null) {
			Node prev = curr;
			Node n = curr.next;
			while (n != null) {
				if (curr.data == n.data) {
					prev.next = n.next;
				} else {
					prev = n;
				}
				n = n.next;
			}
			curr = curr.next;
		}

	}

	private void findUniqueElemnt() {
		Set<Integer> s = new HashSet<>();
		Node n = head;
		Node prev = head;
		while (n != null && n.next != null) {
			if (s.contains(n.data)) {
				prev.next = n.next;
				n = n.next;
			} else {
				s.add(n.data);
				prev = n;
				n = n.next;
			}
		}

	}

	public int printAndfindLength() {
		Node n = head;
		int co = 0;
		while (n != null) {
			co++;
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println("***********");
		return co;
	}

}
