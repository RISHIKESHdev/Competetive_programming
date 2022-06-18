class Solution {
    public int sum(int[] arr,int start, int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int len=arr.length;
        int sum=0;
        for(int i=1;i<=len;i++){
            if(i%2!=0){
                for(int j=0;j<len-i+1;j++){
                    sum+=sum(arr,j,j+i);
                }
            }
        }
        return sum;
    }
}
