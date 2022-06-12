class Solution {
    public boolean backspaceCompare(String s, String t) {
        char arr[]=new char[s.length()];
        char arr1[]=new char[t.length()];
        int end=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(end>=0){
                    arr[end--]='\0';
                }
            }else{
                arr[++end]=s.charAt(i);
            }
        }int end1=-1;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(end1>=0){
                    arr1[end1--]='\0';
                }
            }else{
                arr1[++end1]=t.charAt(i);
            }
        }
        for(int i=0;i<=end||i<=end1;i++){
            if(arr[i]!=arr1[i]){
                return false;
            }
        }return true;
    }
}
