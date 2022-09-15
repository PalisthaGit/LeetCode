package TwoSumII167;

import java.util.Arrays;

public class TwoSumOptimized2 {

	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];

		int left = 0;
		int right = nums.length - 1;

		while (nums[left] + nums[right] != target) {
			if (target > (nums[left] + nums[right])) {
				left++;
			} else {
				right--;
			}
		}
		arr[0] = left + 1;
		arr[1] = right + 1;
		return arr;
	}

	public static void main(String[] args) {

		int array[] = { 2, 3, 4 };
		int target = 6;

		TwoSumOptimized2 obj = new TwoSumOptimized2();
		int result[] = obj.twoSum(array, target);
		System.out.println(Arrays.toString(result));
	}

}
