package RotateArray189;

import java.util.Arrays;

public class RotateArrayOptimized {

	public void rotate(int[] nums, int k) {

		// makes sure that value of k never exceeds nums.length
		k = k % nums.length;
		int left = 0;
		int right = nums.length - 1;

		// reverse the array
		reverse(left, right, nums);

		// reverse the array till k - 1
		reverse(left, k - 1, nums);

		// reverse the array from k-1
		reverse(k, right, nums);

	}

	public void reverse(int left, int right, int nums[]) {

		// reverse array
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			right--;
			left++;

		}
	}

	public static void main(String[] args) {

		RotateArrayOptimized obj = new RotateArrayOptimized();
		int arr[] = { 1, 2, 3 };
		int k = 5;
		obj.rotate(arr, k);
		System.out.println(Arrays.toString(arr));
	}

}
