class Solution {
    private int getNext(int n){
        int next=0;
        while(n>0){
            int last=n%10;
            next+=(last*last);
            n/=10;
        }
        return next;
    }
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            n=getNext(n);
        }
        return n==1;
    }
}
