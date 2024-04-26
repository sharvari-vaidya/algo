package A10.Date20Apr24.LL1;

public class InitializeLL {
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
		InitializeLL ll = new InitializeLL();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		ll.head.next = second;
		second.next = third;
		ll.printLL();

	}

	private void printLL() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

}
