class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0,count=0,ans=0;
        for(int i=0;i<nums.length;i++){
           for(int j=1;j<=nums[i];j++){
            if(nums[i]%j==0){sum+=j;count++;}
            if(count>4)break;
           }
           if(count==4)ans+=sum;
           sum=0;count=0;
        }
        return ans;
    }
}