class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int l = nums.length;
        int arr[] = new int [l];
        Stack<Integer> st = new Stack<>();

        for(int i = 2*l-1;i>=0;i--){

       
        while(st.isEmpty()!= true && st.peek()<=nums[i%l]){
            st.pop();
        }
        if(i<l){
            if(st.isEmpty()== true){
                arr[i] = -1;
            }else{
                arr[i] = st.peek();
            }
           
         }
          st.push(nums[i%l]);
        }
        return arr;

    }
}