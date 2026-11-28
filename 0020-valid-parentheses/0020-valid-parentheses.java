class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1)return false;
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
            st.push(ch);
            else{
                if(!st.isEmpty()){
                char a=st.peek();
               
                if((a=='(' && ch==')') || (a=='{' && ch=='}') || (a=='[' && ch==']') ) st.pop();
                else 
                return false;
                }
                else return false;
            }

        }
     
    if(!st.isEmpty())return false;
    return true;       
    }
}