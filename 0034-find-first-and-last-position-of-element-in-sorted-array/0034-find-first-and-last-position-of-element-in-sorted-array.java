class Solution {
   public int search(int[] nums,int target,boolean bo ){
int ans=-1,e=nums.length-1,s=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target)
            s=mid+1;
            else if(nums[mid]>target)
            e=mid-1;
            else {
                ans=mid;
                if(bo==true) e=mid-1;
                else s=mid+1;}
                }
           return ans;     }
    public int[] searchRange(int[] nums, int target) {
        int a[]={-1,-1};
        int e=nums.length-1,s=0;
    a[0]=search(nums,target, true);
    a[1]=search( nums,target, false);
        return a;
    }
}
 
                