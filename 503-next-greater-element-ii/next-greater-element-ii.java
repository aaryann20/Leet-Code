class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int len = nums.length;
        int arr[] = new int[len];

        for(int i = 0;i<len;i++){
                arr[i]=-1;
            for(int j = 1;j<len;j++){
                
                    int index = (j+i)%len;
                    if(nums[index]>nums[i]){
                        arr[i]=nums[index];
                        break;
                    }
                        
            }
        }
        return arr;
    }
}