class Solution {
    public String largestOddNumber(String num) {
       StringBuilder sb = new StringBuilder(num);
       
       for(int i = sb.length()-1;i>=0;i--){
            char c = sb.charAt(i);
            if((c-'0')%2==1){
                sb.setLength(i+1);
                return sb.toString();

            }

       }
       return "";
    }
}