class Solution {
    List<List<Integer>> result=new ArrayList();
    void backtrack(int[] nums, List<Integer> templist,int start){
        result.add(new ArrayList(templist));
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1])
                continue;
            templist.add(nums[i]);
            backtrack(nums,templist,i+1);
            templist.remove(templist.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,new ArrayList(),0);
        return result;
    }
}
