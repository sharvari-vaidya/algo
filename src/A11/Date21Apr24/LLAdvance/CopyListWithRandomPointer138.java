package A11.Date21Apr24.LLAdvance;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer138 {

	Node head;

	static class Node {
		int data;
		Node next;
		Node random;

		public Node(int d) {
			this.data = d;
			this.next = null;
			this.random = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

	}

	public static void main(String[] args) {
		CopyListWithRandomPointer138 ll = new CopyListWithRandomPointer138();
		ll.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);

		ll.head.next = sec;
		sec.next = third;

		ll.printAndfindLength();

		ll.makeClone();

	}

	private void makeClone() {
		Map<Node, Node> hm = new HashMap<>();
		Node n = head;
		while (n != null) {
			hm.put(n, new Node(n.data));
			n = n.next;
		}
		n = head;
		while (n != null) {
			hm.get(n).next = hm.get(n.next);
			hm.get(n).random = n.random;
			n = n.next;
		}
		hm.get(head);

	}

	public int printAndfindLength() {
		Node n = head;
		int co = 0;
		while (n != null) {
			co++;
			System.out.println(n.toString());
			n = n.next;
		}
		System.out.println("***********");
		return co;
	}

}
