class Solution {
    public int reverseDegree(String s) {
        int sum=0;
          int k=1;
        for(int i=0;i<s.length();i++){
          
           int deg= 26-(s.charAt(i)-'a');
            sum+=(k*deg);
            k++;
        }
        return sum;
    }
}