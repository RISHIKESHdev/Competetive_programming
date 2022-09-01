class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        int[][] count=new int[n][26];
        for(int i=0;i<n;i++){
            for(char c:strs[i].toCharArray()){
                count[i][c-'a']++;
            }
        }
        List<List<String>> result=new ArrayList();
        for(int i=0;i<n;i++){
            List<String> list=new ArrayList();
            if(strs[i]!=null){
                list.add(strs[i]);
                for(int j=i+1;j<n;j++){
                    if(Arrays.equals(count[i],count[j])){
                        list.add(strs[j]);
                        strs[j]=null;
                    }
                }
            }
            if(!list.isEmpty())
                result.add(list);
        }
        return result;
    }
}
