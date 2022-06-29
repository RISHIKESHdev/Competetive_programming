class Solution {
    private boolean isValidWord(String s){
        int hyphen=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='-'){
                hyphen++;
                if(hyphen>1||i==0||i==len-1){
                    return false;
                }
            }
            if(!(c>='a'&&c<='z')){
                if(c=='-'){
                    char ch=s.charAt(i+1);
                    if(ch==','||ch=='.'||ch=='!'){
                        return false;
                    }
                    continue;
                }
                if(i==len-1&&(c=='!'||c=='.'||c==',')){
                    return true;
                }
                return false;
            }
        }
        return true;
    }
    public int countValidWords(String sentence) {
        int count=0;
        for(String s:sentence.split(" ")){
            if(s.length()>0&&isValidWord(s)){
                count++;
            }
        }
        return count;
    }
}
