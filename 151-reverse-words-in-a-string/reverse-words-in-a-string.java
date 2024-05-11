class Solution {
    public String reverseWords(String s) {
        //Split the string into words using space \\s+		
		String[] words = s.trim().split("\\s+");
		
		//read from reverse, attach space and append to string builder
		StringBuilder result=new StringBuilder();
		for(int revIndex=words.length-1;revIndex>=0;revIndex--) {
			result.append(words[revIndex]);
			//append space
			if(revIndex>0) result.append(" ");
			
		}
		return result.toString();
    }
}