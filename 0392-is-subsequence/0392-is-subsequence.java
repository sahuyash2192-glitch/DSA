class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,count=0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i) == s.charAt(j)){
            count++;j++;i++;}
            else 
            i++;
        }
        if(count==s.length())return true;
        return false;
    }
}