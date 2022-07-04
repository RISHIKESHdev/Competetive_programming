class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len=s1.length();
        if(len>s2.length()){
            return false;
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<len;i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-len;i++){
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
            arr2[s2.charAt(i+len)-'a']++;
            arr2[s2.charAt(i)-'a']--;
        }
        return Arrays.equals(arr1,arr2);
    }
}
