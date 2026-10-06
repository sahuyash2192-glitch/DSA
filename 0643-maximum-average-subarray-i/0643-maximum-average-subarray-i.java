class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=k-1,sum=0;
        for(int l=0;l<k;l++){
            sum+=nums[l];
        }
        double avg=(double)sum/k;
        double max=avg;
        while(j<nums.length-1){
            sum-=nums[i];
            i++;
            j++;
            sum+=nums[j];
            avg=(double)sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}