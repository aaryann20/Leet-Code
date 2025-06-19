class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
                if(nums[i]>0){
                    st.add(nums[i]);
                }
        }

        int missing = 1;
        for(int j : st){
            if(st.contains(missing)){
                missing++;
            }
        }
        return missing;
    }
}