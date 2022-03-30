class Solution {
    public void gameOfLife(int[][] board) {
        int row=board.length, col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int live=0;
                for(int dx=-1;dx<2;dx++){
                    for(int dy=-1;dy<2;dy++){
                        if(dx==0 && dy==0)continue;
                        int val=getVal(i+dx,j+dy,row,col,board);
                        if(val==1)live++;
                    }
                }
                if(board[i][j]==1){
                    if(live<2 || live>3)board[i][j]=2;
                }
                else{
                    if(live==3)board[i][j]=3;
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==2)
                    board[i][j]=0;
                else if(board[i][j]==3)
                    board[i][j]=1;
            }
        }
        
    }
    
    public int getVal(int i, int j, int m, int n, int[][] board){
        if(i<0 ||i>=m || j<0 || j>=n)return 0;
        if(board[i][j]==2)return 1;
        else if(board[i][j]==3)return 0;
        else return board[i][j]; 

    }
}
