class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        
        int units=0;
        for(int[] box:boxTypes){
            if(truckSize>box[0]){
                units+=(box[0]*box[1]);
                truckSize-=box[0];
            }else{
                units+=truckSize*box[1];
                return units;
            }
        }
        
        return units;
    }
}
