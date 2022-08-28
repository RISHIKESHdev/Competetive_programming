class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] bool=new boolean[10];
        for(int i=0;i<9;i++){
            bool=new boolean[10];
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c!='.'){
                    if(bool[c-'1'])
                        return false;
                    bool[c-'1']=true;
                }
            }
        }
        for(int i=0;i<9;i++){
            bool=new boolean[10];
            for(int j=0;j<9;j++){
                char c=board[j][i];
                if(c!='.'){
                    if(bool[c-'1'])
                        return false;
                    bool[c-'1']=true;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                bool=new boolean[10];
                for(int k=i*3;k<i*3+3;k++){
                    for(int l=j*3;l<j*3+3;l++){
                        char c=board[k][l];
                        if(c!='.'){
                            if(bool[c-'1'])
                                return false;
                            bool[c-'1']=true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
