class Solution {
    public boolean isValid(String s) {
    Stack<Character>  st = new Stack<>();
    int len = s.length();
    if(len==1) return false;
    
   

    for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);

        }else{
            if(st.empty()) return false;
            if ((ch == ')' && st.peek() != '(') ||
                (ch == ']' && st.peek() != '[') ||
                (ch == '}' && st.peek() != '{')) return false;
                st.pop();
        }
    }

        return st.empty();
    }
}