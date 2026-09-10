class Solution {
    public int longestOnes(int[] nums, int k) {
     int s=0,e=0,max=0,z=0;
     while(e<nums.length){
        int num=nums[e];
        if(num==0)z++;
      while(z>k){
        int st=nums[s];
        if(st==0)z--;
        s++;
      }
      int size=e-s+1;
      max=Math.max(size,max);
      e++;
     }

    return max;
    }
}