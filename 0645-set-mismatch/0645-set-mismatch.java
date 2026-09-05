class Solution {
    void swap(int nums[],int i,int correct){
        int temp=nums[correct];
        nums[correct]=nums[i];
        nums[i]=temp;
    }
    public int[] findErrorNums(int[] nums) {
        
        int i=0,n=nums.length;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else
                i++;
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1)
                return new int[]{nums[j],j+1};
            
        }
        return new int[]{1,1};

    }
}