class Solution {
    public void rotate(int[] a, int k) {
    k=k%a.length;
    int n=a.length;
    int i=0,j=(n-k)-1;
    while(i<j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
        i++;
        j--;
    }
    i=(n-k);j=a.length-1;
     while(i<j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
        i++;
        j--;
    }
    i=0;j=a.length-1;
    while(i<j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
        i++;
        j--;
    }
    

        return ;
    }  
}