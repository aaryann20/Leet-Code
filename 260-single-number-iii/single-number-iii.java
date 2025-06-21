class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans[] = new int[2];
        int idx = 0;
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        if (entry.getValue() == 1) {
            ans[idx++] = entry.getKey();
        }
    }
      return ans ;
}
}