class Solution {
    List<List<Integer>> result=new ArrayList();
    void backtrack(int[] nums,List<Integer> list,int start){
        result.add(new ArrayList(list));
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(nums,list,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,new ArrayList(),0);
        return result;
    }
}
