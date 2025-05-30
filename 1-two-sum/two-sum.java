class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        int array[] = new int [2]; 
        for (int i = 0;i<a;i++){
            int x = target -nums[i];
            for(int j = 0;j<a;j++){
                if(nums[j]==x&j!=i){
                    array[0]=j;
                    array[1]=i;
                }
            }
        }
        return array;
    }
}