class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int groupSum=0;
        List<Integer> list=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            groupSum+=nums[i];
            list.add(nums[i]);
            if(groupSum>sum-groupSum){
                return list;
            }
        }
        return list;
    }
}
