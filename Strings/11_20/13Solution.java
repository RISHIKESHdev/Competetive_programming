class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len=s1.length();
        if(len>s2.length()){
            return false;
        }
        int[] arr=new int[26];
        int[] arr1=new int[26];
        for(int i=0;i<len;i++){
            arr[s1.charAt(i)-'a']++;
            arr1[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-len;i++){
            if(Arrays.equals(arr,arr1)){
                return true;
            }
            arr1[s2.charAt(i+len)-'a']++;
            arr1[s2.charAt(i)-'a']--;
        }
        return Arrays.equals(arr,arr1);
    }
}
