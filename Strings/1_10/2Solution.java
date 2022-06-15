class Solution {
    public String removeOuterParentheses(String s) {
        int start=0;
        int end=0;
        int count=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }
            
            if(count==0){
                end=i;
                str.append(s.substring(start+1,end));
                start=end+1;
                count=0;
            }
        }return str.toString();
    }
}
