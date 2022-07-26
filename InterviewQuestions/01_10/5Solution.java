class Solution {
    int dfs(int[][] matrix,int[][]dp,int m,int n,int i,int j,int prev){
        if(i<0||j<0||i==m||j==n||matrix[i][j]<=prev)
            return 0;
        if(dp[i][j]!=0)
            return dp[i][j];
        int res=1;
        res=Math.max(res,1+dfs(matrix,dp,m,n,i+1,j,matrix[i][j]));
        res=Math.max(res,1+dfs(matrix,dp,m,n,i-1,j,matrix[i][j]));
        res=Math.max(res,1+dfs(matrix,dp,m,n,i,j+1,matrix[i][j]));
        res=Math.max(res,1+dfs(matrix,dp,m,n,i,j-1,matrix[i][j]));
        dp[i][j]=res;
        return res;
    }
    
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        int result=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(matrix,dp,m,n,i,j,-1);
                result=Math.max(result,dp[i][j]);
            }
        }
        return result;
    }
}
