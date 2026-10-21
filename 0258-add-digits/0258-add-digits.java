class Solution {
    public int addDigits(int num) {
   return fun(num,0);
    }  
    int fun(int num,int ans){
           if(num==0){if(ans<10)return ans;
           return fun(ans,0);
           }
   
        ans+=num%10;
     
      return fun(num/10,ans); 
    } 
}