class Solution {
    public boolean isPowerOfFour(int n) {
        return fun(n);
      }
    boolean fun(int n){
        if(n==4 || n==1)return true;
        if(n==0)return false;
        if(n%4==0)return fun(n/4);
        return false;
       
    }
}