class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int subsum=0;
        for(int i=0;i<k;i++){
            subsum+=cardPoints[i];
        }
        int left=k-1,right=cardPoints.length-1;
        int max=subsum;
        for(int i=0;i<k;i++){
            subsum+=(cardPoints[right]-cardPoints[left]);
            right--;
            left--;
            if(max<subsum){
                max=subsum;
            }
        }
        return max;
    }
}
