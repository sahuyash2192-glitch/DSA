class Solution {
    public int findPeakElement(int[] nums) {
        int peak=Integer.MIN_VALUE,ans=0;
for(int i=0;i<nums.length;i++){
    if(peak<nums[i]){
    peak=nums[i];
    ans=i;
    }
}
return ans;
    }
}