package A9.Date21Apr24.LL1;

public class DeletionFromLL {
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
		DeletionFromLL ll = new DeletionFromLL();
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
		int pos = 2;
		ll.deleteNode(pos);
		ll.printAndfindLength();
	}

	private void deleteNode(int pos) {
		Node n = head;
		if (pos == 0) {
			head = n.next;
			n.next = null;
		} else {
			Node pre = head;
			Node nex = head.next;
			while (n.data != pos) {
				pre = n;
				nex = n.next;
				n = n.next;

			}
			pre.next = nex.next;

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
