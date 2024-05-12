class Solution {
    public int[] productExceptSelf(int[] input) {
        int left = 1;
		int n = input.length;
		// start from left and multiple previous
		int result[] = new int[n];
		result[0] = 1;
		for (int index = 1; index < n; index++) {
			result[index] = input[index - 1] * result[index - 1];
		}

		// come from right
		int right = 1;
		for (int index = n - 1; index >= 0; index--) {
			result[index] = right * result[index];
			right = right * input[index];
		}

		return result;
    }
}