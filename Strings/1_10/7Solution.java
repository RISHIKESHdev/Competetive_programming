class Solution {
    public String greatestLetter(String s) {
        int[] lower=new int[26];
        int[] upper=new int[26];
        for(char c:s.toCharArray()){
            if(c>='A'&&c<='Z'){
                upper[c-'A']++;
            }else{
                lower[c-'a']++;
            }
        }
        for(int i=25;i>=0;i--){
            if(upper[i]>0&&lower[i]>0){
                return String.valueOf((char)(i+'A'));
            }
        }
        return "";
    }
}
