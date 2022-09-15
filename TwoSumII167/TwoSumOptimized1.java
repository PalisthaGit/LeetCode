package TwoSumII167;

import java.util.Arrays;

public class TwoSumOptimized1 {

	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];

		int left = 0;
		int right = nums.length - 1;
		while (left < right) {

			int value = nums[left] + nums[right];
			if (target == value) {
				arr[0] = left + 1;
				arr[1] = right + 1;
				break;
			} else if (target > value) {

				left++;
			} else {
				right--;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		int array[] = { 2, 3, 4 };
		int target = 6;

		TwoSumOptimized1 obj = new TwoSumOptimized1();
		int result[] = obj.twoSum(array, target);
		System.out.println(Arrays.toString(result));
	}

}
