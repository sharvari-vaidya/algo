package A10.Date20Apr24.LL1;

public class DeleteFromLL {

	ListNode head;

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		DeleteFromLL ll = new DeleteFromLL();
		ll.head = new ListNode(0);
		ListNode sec = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(3);
		ListNode fifth = new ListNode(4);
		ll.head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;

	}

}
