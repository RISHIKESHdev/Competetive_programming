class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        Map<Character,Character> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(!map.containsKey(c1)&&!map1.containsKey(c2)){
                map.put(c1,c2);
                map1.put(c2,c1);
            }
            else if((map.containsKey(c1)&&map.get(c1)!=c2)||(map1.containsKey(c2)&&map1.get(c2)!=c1)){
                return false;
            }
        }
        return true;
    }
}
