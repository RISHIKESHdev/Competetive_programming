class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean removed=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                continue;
            }
            if(removed){
                return false;
            }
            if(i==0||nums[i-1]<nums[i+1]){
                nums[i]=nums[i+1];
            }else{
                nums[i+1]=nums[i];
            }
            removed=true;
        }
        return true;
    }
}
