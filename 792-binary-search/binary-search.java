class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length ;
       int st = 0;
       int end = n-1;
       if(nums.length==1 && target==nums[0]){
        return 0;
       }
    

       while(st<=end){
        int mid = st + (end-st)/2;
        if(nums[mid] == target){
            return mid ;
        }
        if(nums[mid]<target){
            st = mid +1;
        }
        if(nums[mid]>target){
            end = mid-1;
        }
       }
       return -1;
        
    }
}