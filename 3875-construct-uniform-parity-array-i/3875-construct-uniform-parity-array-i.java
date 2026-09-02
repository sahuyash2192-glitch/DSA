class Solution {
    public boolean uniformArray(int[] nums1) {
 int e=0,o=0;
        for(int i=0;i<nums1.length;i++){
          if(nums1[i]%2==0)e++;
          else o++;
          }
           if(e==nums1.length)return true;
           if (o==nums1.length)return true;
           return true;
        
       
    }
}