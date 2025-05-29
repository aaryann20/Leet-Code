class Solution {
    public static void reversearray(int[] arr, int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within bounds

        // Reverse the entire array
        reversearray(nums, 0, n - 1);

        // Reverse the first k elements
        reversearray(nums, 0, k - 1);

        // Reverse the remaining elements
        reversearray(nums, k, n - 1);
    }
}
