class Solution {
    public int digitFrequencyScore(int n) {
        int fre[]=new int[10],sum=0;
        while(n!=0){
            int digit=n%10;
            fre[digit]++;
            n/=10;
        }
        for(int i=0;i<fre.length;i++){
        if(fre[i]!=0){
            sum+=(fre[i]*i);
        }
        }
        return sum;
    }
}