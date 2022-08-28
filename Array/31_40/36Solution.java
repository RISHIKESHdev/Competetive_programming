class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        
        for(Integer num:map.keySet()){
            Integer freq=map.get(num);
            if(bucket[freq]==null)
                bucket[freq]=new ArrayList();
            bucket[freq].add(num);
        }
        
        int result[]=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0&&k>0;i--){
            if(bucket[i]!=null){
                for(int val:bucket[i]){
                    result[index++]=val;
                    k--;
                }
            }
        }
        return result;
    }
}
