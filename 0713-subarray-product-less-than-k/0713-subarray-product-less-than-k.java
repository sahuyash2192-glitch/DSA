class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0,ans=0;
        long pro=1;
        if(k==0 || k==1)return 0;
        
        while(j<nums.length){
           pro*=nums[j];
            while(pro>=k){
                pro=pro/nums[i];
                
                i++;
            }
            ans+=(j-i)+1;
          j++;  
        }
        return ans;
    }
}