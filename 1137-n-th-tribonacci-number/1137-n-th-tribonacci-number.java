class Solution {
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
     return trib(n,dp);   
    }
    int trib(int n,int dp[]){
        if(n==0 || n==1)return n;
        if(dp[n]!=0)return dp[n];
        else if(n==2)return 1;
        return dp[n]=trib(n-3,dp)+trib(n-2,dp)+trib(n-1,dp);
    }
}