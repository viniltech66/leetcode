class Solution {
    public boolean isSubsequence(String smallString, String bigString) {
        int smallPtr = 0;
		int bigPtr = 0;

		while (bigPtr < bigString.length()) {

			if ((smallPtr < smallString.length()) && bigString.charAt(bigPtr) == smallString.charAt(smallPtr)) {
				smallPtr++;
			}

			if (smallPtr == smallString.length()) {
				return true;
			}

			bigPtr++;
		}

		return smallPtr == smallString.length();
    }
}