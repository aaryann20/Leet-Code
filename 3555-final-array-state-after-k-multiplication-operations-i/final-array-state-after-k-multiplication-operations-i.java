class Solution {
    public static int min(int []arr){
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<arr[idx]){
                min = arr[i];
                idx = i;
                 
                
            }
        }
        return idx;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int j=0;j<k;j++){
            nums[min(nums)] = multiplier * nums[min(nums)]  ;
        }
        return nums;
    }
}