class Solution {
    //cyclic sort method
    void swap(int nums[],int i){
        int temp=nums[nums[i]];
            nums[nums[i]]=nums[i];
            nums[i]=temp; 
    }
    public int missingNumber(int[] nums) {
        int i=0,n=nums.length;
    while(i<n){
        if(i!=nums[i] && nums[i]!=n ){//taking nums[i]!=n because the index will exceed so we are ignoring it 
         swap(nums,i);
        }
        else
        i++;
        }
     for(int j=0;j<nums.length;j++){
        if(j!=nums[j])return j;
     }
    return n;// because it wil length of no eg=3 as shown
    }
}