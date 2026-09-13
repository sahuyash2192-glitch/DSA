class Solution {
    public int maxFrequencyElements(int[] nums) {
         int fre[]=new int[101],max=0,ans=0;
     for(int i=0;i<nums.length;i++){
        fre[nums[i]]++;
     }
    for(int i=0;i<101;i++){
        if(fre[i]!=0)max=Math.max(max,fre[i]);
    }
     for(int i=0;i<101;i++){
        if(fre[i]==max)ans+=max;
    }
    
        return ans;
    }
}