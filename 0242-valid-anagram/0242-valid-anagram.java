class Solution {
    public boolean isAnagram(String s, String t) {
        int ch[]=new int[26];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }
        for(int j=0;j<ch.length;j++){
            if(ch[j]!=0)return false;
        }
   
    return true;
    }
}