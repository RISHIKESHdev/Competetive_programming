class Solution {
    public int calPoints(String[] ops) {
        int[] stack=new int[ops.length];
        int index=-1;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("D")){
                stack[++index]=stack[index-1]*2;
            }else if(ops[i].equals("C")){
                stack[index--]=0;
            }else if(ops[i].equals("+")){
                stack[++index]=stack[index-1]+stack[index-2];
            }else{
                stack[++index]=Integer.parseInt(ops[i]);
            }
        }
        int sum=0;
        for(int i=0;i<=index;i++){
            sum+=stack[i];
        }
        return sum;
    }
}
