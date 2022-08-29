class Solution {
    int minimum=Integer.MAX_VALUE;
    int traverse(int[][] grid,int i,int j,int n,int path){
        if(i<0||j<0||i==n||j==n||grid[i][j]==1)
            return -1;
        if(i==n-1&&j==n-1){
            if(minimum>path)
                minimum=path;
            return path;
        }
        grid[i][j]=1;
        int min=Integer.MAX_VALUE;
        min=Math.min(min,traverse(grid,i+1,j,n,path+1));
        min=Math.min(min,traverse(grid,i,j-1,n,path+1));
        min=Math.min(min,traverse(grid,i-1,j,n,path+1));
        min=Math.min(min,traverse(grid,i,j+1,n,path+1));
        min=Math.min(min,traverse(grid,i+1,j+1,n,path+1));
        min=Math.min(min,traverse(grid,i-1,j-1,n,path+1));
        min=Math.min(min,traverse(grid,i+1,j-1,n,path+1));
        min=Math.min(min,traverse(grid,i-1,j+1,n,path+1));
        grid[i][j]=0;
        return min;
    }
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        traverse(grid,0,0,grid.length,1);
        if(minimum==Integer.MAX_VALUE)
            return -1;
        return minimum;
    }
}
