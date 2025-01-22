class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int st = 0;
        int end = len-1;
       
        int ans = -1;
        while(st<=end){
         int mid = (st+end)/2;
        if(nums[mid]>nums[len-1]){
            st = mid+1;
        }
        else if(nums[mid]<=nums[len-1]){
            ans = mid;
            end = mid-1;
        }
        }
        return nums[ans];
        
    }
}