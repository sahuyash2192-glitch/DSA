class Solution {
    void swap(int nums[],int i){
        int temp=nums[nums[i]];
            nums[nums[i]]=nums[i];
            nums[i]=temp; 
    }
    public int missingNumber(int[] nums) {
        int i=0,n=nums.length;
        // if(nums.length==1)return 1;
    while(i<n){
    
        if(i!=nums[i] && nums[i]!=n ){
         swap(nums,i);
        }
        else
        i++;
        }
     for(int j=0;j<nums.length;j++){
        if(j!=nums[j])return j;
     }
    return n;
    }
}