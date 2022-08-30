class Solution {
    int rot(int[][] grid,int i,int j,int m,int n){
        int count=0;
        if(i>0&&grid[i-1][j]==1){
            grid[i-1][j]=-1;count++;
        }
        if(j>0&&grid[i][j-1]==1){
            grid[i][j-1]=-1;count++;
        }
        if(i<m-1&&grid[i+1][j]==1){
            grid[i+1][j]=-1;count++;
        }
        if(j<n-1&&grid[i][j+1]==1){
            grid[i][j+1]=-1;count++;
        }
        return count;
    }
    public int orangesRotting(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    count++;
            }
        }
        boolean isChanged=true;
        int count1=0;
        int time=-1;
        int curr=0;
        while(isChanged){
            boolean changed=false;
            time++;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==2){
                        curr=rot(grid,i,j,m,n);
                        count1+=curr;
                        if(curr>0)
                            changed=true;
                    }
                }
            }
            if(!changed)
                isChanged=false;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==-1)
                        grid[i][j]=2;
                }
            }
        }
        if(count1!=count){
            return -1;
        }
        return time;
    }
}
