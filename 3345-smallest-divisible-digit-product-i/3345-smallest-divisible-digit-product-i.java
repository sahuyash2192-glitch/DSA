class Solution {
    public int smallestNumber(int n, int t) {
        int pro=1,c=n;
        while(true){
            pro=1;
       while(n!=0){
int rem=n%10;
pro*=rem;
n/=10;
       }
       if(pro%t==0)break;
   c++;n=c;     }
      return c;
    }
}