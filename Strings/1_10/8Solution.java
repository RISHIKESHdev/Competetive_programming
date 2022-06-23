class Solution {
    public int minTimeToType(String word) {
        int result=word.length();
        char curr='a';
        for(char c:word.toCharArray()){
            int time=c-curr;
            if(c<curr)
                time=curr-c;
            time=Math.min(time,26-time);
            result+=time;
            curr=c;
        }
        return result;
    }
}
