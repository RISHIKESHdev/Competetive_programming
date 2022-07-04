class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        int lenH=horizontalCuts.length;
        
        int maxH=Math.max(horizontalCuts[0],h-horizontalCuts[lenH-1]);
        for(int i=1;i<horizontalCuts.length;i++){
            int diff=horizontalCuts[i]-horizontalCuts[i-1];
            if(maxH<diff){
                maxH=diff;
            }
        }
        
        Arrays.sort(verticalCuts);
        int lenV=verticalCuts.length;
        
        int maxV=Math.max(verticalCuts[0],w-verticalCuts[lenV-1]);
        for(int i=1;i<verticalCuts.length;i++){
            int diff=verticalCuts[i]-verticalCuts[i-1];
            if(maxV<diff){
                maxV=diff;
            }
        }
        return (int)((long)maxH * maxV % 1000000007);
    }
}
