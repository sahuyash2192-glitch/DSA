class Solution {
    public int binarysearch(int s,int e,int nums[],int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target)e=mid-1;
            else if(nums[mid]<target)s=mid+1;
            else return mid;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
          int max=-10,pindex=-1;
          if(nums.length==1 && nums[0]==target)return 0;
          for(int i=0;i<nums.length;i++){
            if(nums[i]>max){max=nums[i];pindex=i;}
          }

          int bsearch=binarysearch(0,pindex,nums,target);
          int bsearch2=binarysearch(pindex+1,nums.length-1,nums,target);
         
        if(bsearch==-1 && bsearch2==-1)return -1;
        else if(bsearch2!=-1)return bsearch2;
         return bsearch;  
     
    }
}