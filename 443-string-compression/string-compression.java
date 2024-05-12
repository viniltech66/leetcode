class Solution {
    public int compress(char[] chars) {
        
        int n = chars.length;
        int write = 0; // This is where the next character or count is written in the array.
        int read = 0;  // This is used to read through the array and count repetitions.

        while (read < n) {
            char currentChar = chars[read];
            int count = 0;
            
            // Count consecutive repetitions of the current character
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the current character to the array
            chars[write++] = currentChar;
            
            // If the count is more than one, convert the count to its character representation
            // and write each digit separately.
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (int i = 0; i < countStr.length(); i++) {
                    chars[write++] = countStr.charAt(i);
                }
            }
        }
        
        // Return the 'write' index, which represents the new length of the array.
        return write;

        }
}