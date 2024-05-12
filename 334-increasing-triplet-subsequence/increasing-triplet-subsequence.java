class Solution {
    public boolean increasingTriplet(int[] nums) {
        // if array lngth less than 3 then reject right away
        if (nums == null || (nums != null && nums.length < 3)) {
            return false;
        }

        // initialize and find first and second, if third is greater than first and
        // second we got 3
        int FIRST = Integer.MAX_VALUE;
        int SECOND = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num <= FIRST) {
                FIRST = num;
            } else if (num <= SECOND) {
                SECOND = num;
            } else {
                return true;
            }

        }

        return false;
    }
}