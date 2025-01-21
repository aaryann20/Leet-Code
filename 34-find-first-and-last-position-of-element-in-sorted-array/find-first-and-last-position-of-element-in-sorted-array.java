class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Default result if target is not found

        // Find the first occurrence
        int st = 0, end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2; // Calculate mid
            if (nums[mid] == target) {
                result[0] = mid; // Record the position
                end = mid - 1;  // Search in the left half
            } else if (nums[mid] < target) {
                st = mid + 1;   // Search in the right half
            } else {
                end = mid - 1;  // Search in the left half
            }
        }

        // Find the last occurrence
        st = 0;
        end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2; // Calculate mid
            if (nums[mid] == target) {
                result[1] = mid; // Record the position
                st = mid + 1;    // Search in the right half
            } else if (nums[mid] < target) {
                st = mid + 1;    // Search in the right half
            } else {
                end = mid - 1;   // Search in the left half
            }
        }

        return result;
    }
}
