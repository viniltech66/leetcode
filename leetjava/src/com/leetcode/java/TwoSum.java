package com.leetcode.java;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

 */

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ex1[] = new int[] {2,7,11,15};
		int target1=9;
		System.out.println(calculateTwoSum(ex1,target1)[0]+","+calculateTwoSum(ex1,target1)[1]);
		int ex2[]=new int[] {3,2,4};
		int target2=6;
		System.out.println(calculateTwoSum(ex2,target2)[0]+","+calculateTwoSum(ex2,target2)[1]);
		int ex3[]=new int[] {1,2,8,9,3,3};
		int target3=6;
		System.out.println(calculateTwoSum(ex3,target3)[0]+","+calculateTwoSum(ex3,target3)[1]);
	}

	private static int[] calculateTwoSum(int[] nums, int target) {

		if (nums.length > 2) {

			for (int i = 0; i < nums.length; i++) {

				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] + nums[j] == target) {
						return new int[] {i,j};
					}
				}
			}

		}
		return new int[] { 0, 1 };
	}

}
