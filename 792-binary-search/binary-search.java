class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length-1;
        int st =0;
        int end = n;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(nums[mid]==target) return mid;

            if(nums[mid]>target){
                end = mid -1;
            }else{
                st = mid +1;
            }
        }
        return -1;
        
    }
}