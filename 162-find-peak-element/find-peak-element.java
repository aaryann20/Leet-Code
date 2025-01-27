class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        // Handle edge cases for single element arrays
        if (n == 1) {
            return 0;
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // Check if mid is a peak element
            boolean isLeftSmaller = (mid == 0 || nums[mid] > nums[mid - 1]);
            boolean isRightSmaller = (mid == n - 1 || nums[mid] > nums[mid + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return mid;
            }

            // If the right neighbor is greater, search the right half
            if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
                st = mid + 1;
            } else { // Otherwise, search the left half
                end = mid - 1;
            }
        }

        return -1; // This line won't be reached for valid input
    }
}
