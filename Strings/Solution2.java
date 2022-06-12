class Solution {
    public String removeOuterParentheses(String s) {
        int start=0;
        int end=0;
        int count1=0;
        int count2=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count1++;
            }else if(s.charAt(i)==')'){
                count2++;
            }
            
            if(count1==count2){
                end=i;
                str.append(s.substring(start+1,end));
                start=end+1;
                count1=0;count2=0;
            }
        }return str.toString();
    }
}
