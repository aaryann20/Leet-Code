class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int cnt =0;
        for(int i=0; i<n-2; i++)
        {
            if(nums[i]==0)
            {
                nums[i]=1;
                nums[i + 1] = 1 - nums[i + 1]; 
                nums[i + 2] = 1 - nums[i + 2];
                cnt++;
            }  
        }
        if (nums[n - 1] == 0 || nums[n - 2] == 0) {
            return -1;
        }
        return cnt;
    }
}