class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,max=0, z=0;
        while(j<nums.length){
            
            if(nums[j]==0)z++;
            while(z>1){
               if(nums[i]==0) z--;
               i++;
             
            }
            max=Math.max(max,(j-i));
            j++;
        }
        return max;
    }
}