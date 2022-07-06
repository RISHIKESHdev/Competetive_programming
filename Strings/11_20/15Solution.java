class Solution {
    public String longestPalindrome(String s) {
        int max=0,len=s.length();
        char[] arr=s.toCharArray();
        String result=null;
        for(int i=0;i<len;i++){
            int start=i,end=i;
            while(start>=0&&end<len&&arr[start]==arr[end]){
                if(end-start+1>max){
                    result=s.substring(start,end+1);
                    max=end-start+1;
                }
                start--;end++;
                
            }
            start=i;
            end=i+1;
            while(start>=0&&end<len&&arr[start]==arr[end]){
                if(end-start+1>max){
                    result=s.substring(start,end+1);
                    max=end-start+1;
                }
                start--;end++;
            }
        }
        return result;
    }
}
