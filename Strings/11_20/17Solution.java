class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split=s.split(" ");
        if(split.length!=pattern.length())
            return false;
    
        Map<Character,String> map=new HashMap<>();
        
        for(int i=0;i<split.length;i++){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(split[i])){
                    return false;
                }
            }else{
                if(map.containsValue(split[i])){
                    return false;
                }
                map.put(c,split[i]);
            }
        }
        return true;
    }
}
