class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0,index=0;
        char[] arr=new char[4];
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(count==0){
                    arr[index++]=s1.charAt(i);
                    arr[index++]=s2.charAt(i);
                }if(count==1){
                    arr[index++]=s1.charAt(i);
                    arr[index++]=s2.charAt(i);
                }
                count++;
            }
        }
        if(count==0||(count==2&&arr[0]==arr[3]&&arr[1]==arr[2])){
            return true;
        }
        return false;
    }
}
