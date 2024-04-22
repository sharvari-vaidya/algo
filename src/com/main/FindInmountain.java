package com.main;

interface MountainArray {

	public int get(int index);

	public int length();
}

class a implements MountainArray {
	int[] a = { 1,2,3,4,5,3,1};

	@Override
	public int get(int index) {
		return a[index];
	}

	@Override
	public int length() {
		return a.length;
	}

}

public class FindInmountain {

	public static void main(String[] args) {
		MountainArray m = new a();
		int target = 3;
		System.out.println(findInMountn(target, m));
	}

	private static int findInMountn(int target, MountainArray m) {
		int left = -1, right = m.length();
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (m.get(mid) < m.get(mid + 1)) {
				left = mid+1;
			} else {
				right = mid;
			}

		}
		int i = 0;
		boolean flag= false;
		while (i <= left) {
			int mid = i + (left - i) / 2;
			if(m.get(mid)==target) {
				i=mid;
				flag =true;
				break;
			}
			else if (m.get(mid) < target) {
				i = mid+1;
			} else {
				left = mid-1;
			}
		}
		if(flag) {
			return i;
		}
		return -1;

	}

}
