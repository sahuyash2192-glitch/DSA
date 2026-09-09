class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0,j=k-1,sum=0;
       double avg=0;
       for(int l=0;l<k;l++){
        sum+=nums[l];
       }
       avg=(double)sum/k;
       double maxavg=avg;
       while(j<nums.length-1){
        sum-=nums[i];
        i++;
        j++;
        sum+=nums[j];
        avg=(double)sum/k;
        maxavg=Math.max(avg,maxavg);
       }
       return maxavg;
    }
}