class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#' && !st.isEmpty())st.pop();
            else if(ch!='#') st.push(ch);
        }
        for(char ch:t.toCharArray()){
            if(ch=='#' && !st2.isEmpty())st2.pop();
            else if(ch!='#') st2.push(ch);
        }
    if(st.equals(st2))return true;
    return false;
    }
}