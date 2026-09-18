class Solution {
    int binarysearch(int nums[],int target,boolean bo){
        int e=nums.length-1,s=0;int ans=-1;
        while(s<=e){
           
            int mid=s+(e-s)/2;
            if(nums[mid]>target)e=mid-1;
            else if(nums[mid]<target)s=mid+1;
            else{if(bo==true){s=mid+1;
                    ans=mid;}
                else {e=mid-1;ans=mid;}
            }
        }

return ans;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]={0,0};
        if(nums.length==1 && target==nums[0])return ans;
        int f=binarysearch(nums,target,false);
        int l=binarysearch(nums,target,true);
        ans[0]=f;
        ans[1]=l;
        return ans;
        
    }
}