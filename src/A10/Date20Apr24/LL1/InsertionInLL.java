package A10.Date20Apr24.LL1;

public class InsertionInLL {

	Node head;
	int count;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		InsertionInLL ll = new InsertionInLL();

		ll.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);

		ll.head.next = sec;
		sec.next = third;

		ll.count = ll.printAndfindLength();
		Node zero = new Node(0);
		int pos = 0;
//		ll.insert(zero, pos, ll.count);
//		ll.printAndfindLength();
		zero = new Node(4);
		ll.insert(zero, 2, ll.count);
		ll.printAndfindLength();
	}

	private void insert(Node zero, int pos, int len) {
		if (pos == 0) {// at the begining
			zero.next = head;
			head = zero;
		} else {
			Node n = head;
			for (int i = 1; i < pos; i++) {
				n = n.next;
			}

			zero.next = n.next;
			n.next = zero;

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
