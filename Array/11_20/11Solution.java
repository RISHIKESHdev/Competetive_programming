class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int[] arr=new int[nums.length-1];
            int index=0;
            for(int j=0;j<nums.length-1;j++){
                if(index==i)
                    index++;
                arr[j]=nums[index++];
            }
            boolean bool=true;
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>=arr[j]){
                    bool=false;
                    break;
                }
            }
            if(bool)
                return true;
        }
        return false;
    }
}
