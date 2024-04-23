package A9.Date21Apr24.LL1;

public class ReverseLL {
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
		ReverseLL ll = new ReverseLL();
		ll.head = new Node(0);
		Node sec = new Node(1);
		Node third = new Node(2);
		Node fourth = new Node(3);
		Node fifth = new Node(4);
		ll.head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		ll.printAndfindLength();
		ll.reverseLL();
		ll.printAndfindLength();

	}

	private void reverseLL() {

		Node curr = head;
		Node pre = null;
		Node nex = null;

		while (curr != null) {
			nex = curr.next;
			curr.next = pre;
			pre = curr;
			curr = nex;
		}
		head = pre;

	}

	private void printAndfindLength() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println("***********");
	}
}
