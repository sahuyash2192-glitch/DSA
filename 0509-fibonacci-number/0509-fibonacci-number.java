class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
       return  fib(n,dp);
    }
    int fib(int n,int dp[]){
    if(n==0 || n==1)return n;
    if(dp[n]!=0)return dp[n];
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
}