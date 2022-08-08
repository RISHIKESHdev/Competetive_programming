class Solution {
    List<List<Integer>> result=new ArrayList<>();
    
    void backtrack(int[] nums, List<Integer> list){
        if(list.size()==nums.length)
            result.add(new ArrayList(list));
        else{
            for(int i=0;i<nums.length;i++){
                if(list.contains(nums[i]))
                    continue;
                list.add(nums[i]);
                backtrack(nums,list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,new ArrayList());
        return result;
    }
}
