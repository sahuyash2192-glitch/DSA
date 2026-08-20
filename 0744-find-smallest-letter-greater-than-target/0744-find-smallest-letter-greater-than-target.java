class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     int s=0,e=letters.length-1;
     if(target<letters[0])return letters[0];
     if(target>=letters[letters.length-1])return letters[0];
     while(s<=e){
        int mid=s+(e-s)/2;
        if(target<letters[mid])
        e=mid-1;
        else s=mid+1;

        
     }
     return letters[s%letters.length];
    }
}