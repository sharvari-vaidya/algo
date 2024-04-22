package com.leetcode;

import com.leetcode.IntersectionOfTwoLL160.ListNode;

public class MiddleOfLL876 {
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
		MiddleOfLL876 ll = new MiddleOfLL876();

		ll.head = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode thir = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);

		ll.head.next = sec;
		sec.next = thir;
		thir.next = four;
		four.next = five;
		int len = ll.findLength();
		ll.findMiddle(len);

	}

	private void findMiddle(int len) {
		int i = 0;
		ListNode n = head;
		while (i < len / 2) {
			i++;
			n = n.next;

		}
		System.out.println(n.val);
	}

	private int findLength() {

		ListNode n = head;
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}

}
