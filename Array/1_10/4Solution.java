class Solution {
    public int maxArea(int[] height) {
        int len=height.length-1;
        int i=0;
        int maxArea=0;
        while(i<len){
            int high=Math.min(height[i],height[len]);
            int width=len-i;
            int area=high*width;
            if(maxArea<area){
                maxArea=area;
            }
            if(height[i]<height[i+1]){
                i++;
            }else if(height[len]<height[len-1]){
                len--;
            }else{
                i++;len--;
            }
                
        }return maxArea;
    }
}
