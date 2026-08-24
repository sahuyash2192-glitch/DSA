class Solution {
    public boolean checkDivisibility(int n) {
    int sum=0,pro=1,c=n;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        return (c%(sum+pro)==0) ? true:false; 
       
    }
}