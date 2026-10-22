class Solution {
    public int numberOfMatches(int n) {
      
       return fun(n,0);
    }
    int fun(int n,int matches){
        if(n==0 || n==1)return matches;
        if(n%2==0){return matches+fun(n/2,n/2);
        }
        return matches+fun(((n-1)/2)+1,(n-1)/2);
        

    }
}