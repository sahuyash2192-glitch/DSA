class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        if(n==0 || n==1)return n;
        
        return dp[n]=fib(n-1)+fib(n-2);
      
    }
}