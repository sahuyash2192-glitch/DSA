class Solution {
    public char findTheDifference(String s, String t) {
        int as=0,at=0;
        for(int i=0;i<s.length();i++){
as+=s.charAt(i);
        }
      for(int i=0;i<t.length();i++){
         at+=t.charAt(i);
        }
        char ans=(char)(at-as);
        
        return ans;
    }
}