class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        fun(n,ans,"",0,0);
    return ans;
    }
    void fun(int n,List<String> ans,String s,int o,int c){
        if(o==n && c==n){
            ans.add(s);
            return;
        }
        if(o<n)fun(n,ans,s+"(",o+1,c);
        if(c<o)fun(n,ans,s+")",o,c+1);
    }
}