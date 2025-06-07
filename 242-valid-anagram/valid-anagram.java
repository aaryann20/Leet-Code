class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;}
           
        Map<Character,Integer> one = new HashMap<>();
        Map<Character,Integer> two = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if (!one.containsKey(currentChar)) { 
                one.put(currentChar, 1);   
            }else{
                one.put(currentChar, one.get(currentChar) + 1);   
            }
        }

        for(int j = 0;j<t.length();j++){
            char currentChar1 = t.charAt(j);
            if (!two.containsKey(currentChar1)) { 
                two.put(currentChar1, 1);   
            }else{
                two.put(currentChar1, two.get(currentChar1) + 1);   
            }
        }

    
    return one.equals(two);
        
    }
}
