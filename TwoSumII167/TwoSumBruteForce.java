package TwoSumII167;

import java.util.Arrays;

public class TwoSumBruteForce {

	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {

					arr[0] = i + 1;
					arr[1] = j + 1;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int array[] = {2,3,4};
		int target = 6;
		
		TwoSumBruteForce obj = new TwoSumBruteForce();
		int result[] = obj.twoSum(array, target);
        System.out.println(Arrays.toString(result));
	}

}
