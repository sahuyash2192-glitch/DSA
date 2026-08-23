class Solution {
    public int maxArea(int[] height) {
        int max=0,i=0,j=height.length-1;
        while(i<j){
            int w=j-i;
            int area=w*Math.min(height[i],height[j]);
            if(area>max){
            max=area;}
            if(height[i]>height[j]) j--;
            else i++;
        
        }
        return max;

    }}