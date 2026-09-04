class Solution {
    void swap(int nums[],int correct,int i){
        int temp=nums[correct];
        nums[correct]=nums[i];
        nums[i]=temp;
    }
    public int findDuplicate(int[] nums) {
      int i=0,n=nums.length,count=1;
      while(i<n){
        int correct=nums[i]-1;
        if(nums[i]!=nums[correct])
          swap(nums,correct,i);
        else
          i++;
      }
      System.out.println(Arrays.toString(nums));
for(int index=0;index<n;index++){
    if(nums[index]!=index+1)
   count=nums[index];
}
     
      return count; 
    }
    
}