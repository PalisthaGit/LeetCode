package RotateArray189;

import java.util.Arrays;

public class RotateArrayBruteForce {

	public void rotate(int[] nums, int k) {

		// run for k times
		for (int i = 1; i <= k; i++) {
			// store the last element
			// to assign it to first index
			int temp = nums[nums.length - 1];

			// shift the elements one step forward
			// except for first element
			for (int j = nums.length - 1; j > 0; j--) {

				nums[j] = nums[j - 1];
			}
			// assign temp as first value
			nums[0] = temp;
		}

	}

	public static void main(String[] args) {

		RotateArrayBruteForce obj = new RotateArrayBruteForce();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		obj.rotate(arr, k);
		System.out.println(Arrays.toString(arr));
	}

}
