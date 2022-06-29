class Solution {
    public String removeDuplicates(String s) {
        int i=0;
        char[] res = s.toCharArray();
        for (int j=0;j<s.length();j++) {
            res[i] = res[j];
            if (i > 0 && res[i-1]==res[i]){
                i -= 2;
            }
            i++;
        }
        return new String(res, 0, i);
    }
}
