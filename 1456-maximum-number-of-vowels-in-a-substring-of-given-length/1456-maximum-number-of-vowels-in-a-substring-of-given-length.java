class Solution {
    boolean vowel(char x){
        
        if(x=='a' || x=='e' || x=='i' || x=='o' ||  x=='u')return true;
        
    return false;
    }
    public int maxVowels(String s, int k) {
    int i=0,j=k-1,count=0;
    for(int l=0;l<k;l++){
        if(vowel(s.charAt(l)))count++;
        }
    int max=count;
    while(j<s.length()-1){
        if(vowel(s.charAt(i)))count--;
        i++;
        j++;
        if(vowel(s.charAt(j)))count++;
        max=Math.max(max,count);
        if(max==k)return k;
    }
    return max;
    }
}