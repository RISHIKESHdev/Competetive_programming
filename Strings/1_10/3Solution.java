class Solution {
    private Boolean isPalindrome(String word){
        int start=0,end=word.length()-1;
        while(start<end){
            if(word.charAt(start)!=word.charAt(end)){
                return false;
            }start++;end--;
        }return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word)){
                return word;
            }
        }return "";
    }
}
