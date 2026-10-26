class Solution {
    public boolean isPowerOfThree(int n) {
    if(n==1)return true;
     return  fun(n);  
    }
    boolean fun(int n){
        if(n==0)return false;
        if(n==3)return true;
       if(n%3==0) return fun(n/3);
       return false;

    }
}