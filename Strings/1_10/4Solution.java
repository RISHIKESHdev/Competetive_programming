class Solution {
    public String sortString(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder str=new StringBuilder();
        int i=0;
        while(i<s.length()){
            for(int j=0;j<26;j++){
                if(arr[j]>0){
                    arr[j]--;i++;
                    str.append((char)('a'+j));
                }
            }
            for(int j=25;j>=0;j--){
                if(arr[j]>0){
                    arr[j]--;i++;
                    str.append((char)('a'+j));
                }
            }
        }
        return str.toString();
    }
}
