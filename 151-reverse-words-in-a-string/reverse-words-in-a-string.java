class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split(" +");
        StringBuilder sb = new StringBuilder();
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
           sb.append(arr[i]);
           sb.append(" ");
        }
        String ans = sb.toString().trim();
        return ans ;
    }
}