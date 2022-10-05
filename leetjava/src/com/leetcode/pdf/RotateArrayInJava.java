package com.leetcode.pdf;

import java.util.Arrays;

/*
 * 
 */
public class RotateArrayInJava {

	/*
	 * Problem: Rotate an array of n elements to the right by k steps. For example,
	 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
	 * [5,6,7,1,2,3,4]. How many different ways do you know to solve this problem?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = { 1, 2, 3, 4, 5, 6 };
		int array2[] = new int[array1.length];
		int array3[]= new int[array1.length];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		System.arraycopy(array1, 0, array3, 0, array1.length);
		int steps = 2;
		System.out.println("Solution1");
		Solution1(array1, steps);
		System.out.println("Solution2");
		Solution2(array2, steps);
		System.out.println("Solution3");
		Solution2(array3, steps);
	}

	/*
	 * Space is O(n) and time is O(n).
	 */
	private static void Solution1(int[] array, int steps) {
		if (steps > array.length) {
			steps = steps % array.length;
			System.out.println("steps after:" + steps);
		}

		int[] result = new int[array.length];

		for (int index = 0; index < steps; index++) {
			result[index] = array[array.length - steps + index];

		}

		int counter = 0;
		for (int index = steps; index < array.length; index++) {
			result[index] = array[counter];
			counter++;
		}

		System.arraycopy(result, 0, array, 0, array.length);
		System.out.println(Arrays.toString(array));
	}

	/*
	 * it is like bubble sort time is O(n*k)
	 */
	private static void Solution2(int[] array, int steps) {
		if (array == null || steps < 0) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		int temp = 0;
		for (int s = 0; s < steps; s++) {
			for (int j = array.length - 1; j > 0; j--) {
				temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		}

		System.out.println(Arrays.toString(array));
	}

	/*
	 * 
	 * Can we do this in O(1) space and in O(n) time? The following solution does.
	 * Assuming we are given 1,2,3,4,5,6 and order 2. The basic idea is: 1. Divide
	 * the array two parts: 1,2,3,4 and 5, 6 2. Rotate first part: 4,3,2,1,5,6 3.
	 * Rotate second part: 4,3,2,1,6,5 4. Rotate the whole array: 5,6,1,2,3,4
	 */
	private static void Solution3(int[] array, int steps) {
		steps = steps % array.length;

		if(array==null & steps <0 ) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		
		reverseArray(array, 0, steps);
		reverseArray(array, steps, array.length);
		reverseArray(array,0,array.length);
		
	}

	private static void reverseArray(int[] arr, int left, int right) {
		if (arr == null || arr.length == 1) {
			return;
		}

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

	}
}
