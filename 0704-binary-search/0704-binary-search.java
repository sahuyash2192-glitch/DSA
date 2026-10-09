class Solution {
    public int search(int[] nums, int target) {
        return rec(0,nums.length-1,nums,target);
        
    }
 int rec(int s,int e,int nums[],int target){
    if(s>e)return -1;
    int mid=s+(e-s)/2;
    if(nums[mid]==target)return mid;
    else if(nums[mid]>target)return rec(s,mid-1,nums,target);
    else return rec(mid+1,e,nums,target);

 }
}