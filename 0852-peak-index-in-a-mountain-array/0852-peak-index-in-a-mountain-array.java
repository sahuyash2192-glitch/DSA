class Solution {
    public int peakIndexInMountainArray(int[] nums) {
         int e=nums.length-1,s=0;
    int max=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>max){
            max=mid;if(nums[mid+1]>nums[max]) s=mid+1;
            else if(nums[mid-1]>nums[max]) e=mid-1;
            else return max;
            }
           else s=mid+1;
           }
   return max;

    }
}