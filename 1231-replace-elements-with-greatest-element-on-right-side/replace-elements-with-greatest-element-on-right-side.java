class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize the result array with -1
        
        if (n == 0) return result; // Edge case for empty array
        
        for (int i = 0; i < n - 1; i++) {
            int maxRight = arr[i + 1];
            for (int j = i + 2; j < n; j++) {
                maxRight = Math.max(maxRight, arr[j]);
            }
            result[i] = maxRight;
        }
        
        return result;
    }
}