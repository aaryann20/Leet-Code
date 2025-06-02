class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String str = s.trim();
       // if(str.length()==1) return 1;
        for(int i = str.length()-1;i>=0;i--){
            
            if(str.charAt(i)!= ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}