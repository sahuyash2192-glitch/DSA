class Solution {
    
         void swap(int nums[],int i){
        int temp=nums[nums[i]-1];
        nums[nums[i]-1]=nums[i];
        nums[i]=temp;
    }
    
  public List<Integer> findDuplicates(int[] nums) {
        int i=0,n=nums.length,uni=0;
        List<Integer> ans=new ArrayList<>();
   while(i<n){
int correct =nums[i]-1;
    if(nums[i]!=nums[correct] ){
        swap(nums,i);
    }
    else
    i++;
   }
 
   for(int j=0;j<n;j++){
    if(nums[j]!=j+1)
    ans.add(nums[j]);
   }
     return ans;
    }
}