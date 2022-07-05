class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int index=0;
        int start=n/2;
        while(start>0){
            arr[index++]=start;
            arr[index++]=start*-1;
            start--;
        }
        
        return arr;
    }
}
