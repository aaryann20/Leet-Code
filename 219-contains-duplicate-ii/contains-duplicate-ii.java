import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int sum = 0;
        int l = nums.length;
        for(int i = 0 ;i<l;i++){
            for(int j = i + 1; j <= i + k && j < l; j++){
                if(nums[j]==nums[i]){
                    return true ;
                }
            }
        }
        return false;
        
    }
}