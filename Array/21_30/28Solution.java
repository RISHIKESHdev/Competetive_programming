class Solution {
    List<List<Integer>> list=new ArrayList<>();
    
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    private void permutation(int[] arr,int start,int end){
        if(start==end){
            List<Integer> l=Arrays.stream(arr).boxed().collect(Collectors.toList());
            list.add(l);
        }
        for(int i=start;i<end;i++){
            swap(arr,start,i);
            permutation(arr,start+1,end);
            swap(arr,start,i);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        permutation(nums,0,nums.length);
        return list;
    }
}
