class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int num=i,count=0;
            while(num>0){
                if(num%2==1){
                    count++;
                }num/=2;
            }
            arr[i]=count;
        }
        return arr;
    }
}
