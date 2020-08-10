package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		if (arr == null) {
			return 0;
		} else {
			int sum = 0;
			for (int num : arr) {
				sum += num;
			}
			return sum;

		}
	}
}
