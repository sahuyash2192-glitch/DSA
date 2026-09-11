class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,j=k-1,ans=0,sum=0;
        for(int l=0;l<k;l++){
            sum+=arr[l];
        }
        int avg=sum/k;
        if(avg>=threshold)ans++;
        while(j<arr.length-1){
        
        sum-=arr[i];
        i++;
        j++;
        sum+=arr[j];
        avg=sum/k;
        if(avg>=threshold)ans++;
        }
    
      return ans;  
    }
}