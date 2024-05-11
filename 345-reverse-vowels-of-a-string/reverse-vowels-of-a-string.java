class Solution {
    public String reverseVowels(String s) {
        	String vowelString = "aeiouAEIOU";

		char[] chararr = s.toCharArray();

		int leftIndex = 0;
		int rightIndex = chararr.length - 1;

		while (leftIndex < rightIndex) {

			// left pointer
			while (leftIndex < rightIndex && vowelString.indexOf(chararr[leftIndex]) == -1) {
				leftIndex++;
			}

			// right pointer
			while (leftIndex < rightIndex && vowelString.indexOf(chararr[rightIndex]) == -1) {
				rightIndex--;
			}

			//we found vowels in both positions, so we have to swap
			char temp = chararr[leftIndex];
			chararr[leftIndex] = chararr[rightIndex];
			chararr[rightIndex]=temp;
			
			leftIndex++;
			rightIndex--;
		}

		return new String(chararr);

    }
}