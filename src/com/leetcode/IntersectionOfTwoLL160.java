package com.leetcode;

public class IntersectionOfTwoLL160 {
	ListNode head;

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {

		IntersectionOfTwoLL160 ll = new IntersectionOfTwoLL160();

		ll.head = new ListNode(1);
		ListNode sec = new ListNode(9);
		ListNode thir = new ListNode(1);
		ListNode four = new ListNode(2);
		ListNode five = new ListNode(4);

		ll.head.next = sec;
		sec.next = thir;
		thir.next = four;
		four.next = five;

		IntersectionOfTwoLL160 ll2 = new IntersectionOfTwoLL160();
		ll2.head = new ListNode(3);
		ListNode sec1 = new ListNode(2);
		ListNode thir1 = new ListNode(4);
//		ListNode four1 = new ListNode(6);
//		ListNode five1 = new ListNode(5);

		ll2.head.next = sec1;
		sec1.next = thir1;
//		thir1.next = four1;
//		four1.next = five1;
//		five1.next = four;

		findInterSection(ll.head, ll2.head);

	}

	private static void findInterSection(ListNode head1, ListNode head2) {

		int len1 = findLength(head1);
		int len2 = findLength(head2);
		ListNode poi1 = head1, poi2 = head2;
		int diff = Math.abs(len1 - len2);
		System.out.println(len1 + " " + len2);
		if (len1 > len2) {
			while (diff > 0) {
				poi1 = poi1.next;
				diff--;
			}
		} else {
			while (diff > 0) {
				poi2 = poi2.next;
				diff--;
			}
		}

		while (poi1 != null && poi2 != null) {
			if (poi1 == poi2) {
				System.out.println(poi1.val);
				break;
			}
			poi1 = poi1.next;
			poi2 = poi2.next;
		}

	}

	private static int findLength(ListNode head1) {

		ListNode n = head1;
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}

}
