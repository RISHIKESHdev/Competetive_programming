class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int count=0,index=0;
        for(int num:nums){
            if(num==target)
                count++;
            if(num<target)
                index++;
        }
        
        while(count-->0)
            list.add(index++);
        
        return list;
    }
}
