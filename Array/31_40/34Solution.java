class Solution {
    List<List<Integer>> result=new ArrayList();
    
    void backtrack(List<Integer> list,int n,int k,int start){
        if(k==0){
            result.add(new ArrayList(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            backtrack(list,n,k-1,i+1);
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        backtrack(new ArrayList(),n,k,1);
        return result;
    }
}
