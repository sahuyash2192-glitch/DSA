class Solution {
    public int numberOfSteps(int num) {
        return fun(num,0);
    }
    int fun(int num,int c){
        if(num==0) return c;
        if(num%2==0){return fun(num/2,c+1);}
         return fun(num-1,c+1);}
    
    }
