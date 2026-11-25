class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        String ans="";
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                st.pop(); 
            }
            else 
                st.push(ch);
        }
        for(char ch:st){
            if(ch!='*')ans+=ch;
        }
        return ans;
    }
}