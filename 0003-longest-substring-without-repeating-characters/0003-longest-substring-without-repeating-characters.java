class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,i=0;
        int fre[]=new int[256];
        for(int j=0;j<s.length();j++){
            fre[s.charAt(j)]++;
            while(fre[s.charAt(j)]>1){
                fre[s.charAt(i)]--;
                i++;
            }
     
           max=Math.max(max,(j-i)+1); 
          
        }

    
      return max;
    }
}