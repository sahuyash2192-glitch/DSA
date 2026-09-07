class Solution {
    boolean anagram(String subs,String s1){
        int fre[]=new int[26];
        for(int i=0;i<s1.length();i++){
            fre[s1.charAt(i)-'a']++;
            fre[subs.charAt(i)-'a']--;
        }
         for(int i=0;i<26;i++){
            if(fre[i]!=0)return false;}
            return true;
    }

    public boolean checkInclusion(String s1, String s2) {
    int k=s1.length(),i=0;
    while(i<=s2.length()-k){
        
        String subs=s2.substring(i,i+k);
        boolean ans=anagram(subs,s1);
        if(ans==true)return true;      
        i++;
    } 
      return false;  
    } 
}