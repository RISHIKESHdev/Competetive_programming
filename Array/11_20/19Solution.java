class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        int[] arr=new int[m+n];
        int pos=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                arr[pos]=nums1[i++];
            }else{
                arr[pos]=nums2[j++];
            }pos++;
        }
        while(i<m){
            arr[pos++]=nums1[i++];
        }while(j<n){
            arr[pos++]=nums2[j++];
        }
        for(i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
        
    }
}
