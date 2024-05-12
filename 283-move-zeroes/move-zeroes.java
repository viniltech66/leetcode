class Solution {
    public void moveZeroes(int[] nums) {
       System.out.println("input: " + Arrays.toString(nums));
		int insertPos = 0;
		int n = nums.length;

		// move all non zeroes to the start
		for (int num : nums) {
			if (num != 0) {
				nums[insertPos++] = num;
			}
		}

		while (insertPos < n) {
			nums[insertPos++] = 0;
		}

		System.out.println("output: " + Arrays.toString(nums)); 
    }
}