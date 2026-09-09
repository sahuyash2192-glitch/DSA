class Solution {
    public int countGoodSubstrings(String s) {
        int i=0,count=0;
        while(i<s.length()-2){
        char ch=s.charAt(i);
        char ch2=s.charAt(i+1);
        char ch3=s.charAt(i+2);
            if(ch!=ch2 && ch2!=ch3 && ch!=ch3){
            count++;}
            i++;
        

        }
    
        return count;
    }
}