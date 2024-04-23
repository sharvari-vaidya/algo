package A9.Date21Apr24.LL1;

public class FindCycleInLL {

	ListNode head;

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		FindCycleInLL ll = new FindCycleInLL();
		ll.head = new ListNode(0);
		ListNode sec = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(3);
		ListNode fifth = new ListNode(4);
		ll.head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		ll.findCycle();
	}

	private boolean findCycle() {

		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}

		return false;

	}

}
