class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int m= grid.length;
        int n= grid[0].length;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                int count=1;
                if(grid[i][j]==1)
                {
                    max = Math.max(max, getMaxLength(grid, i, j));
                }
                
            }
        }
        return max;
    }
    
    private int getMaxLength(int[][] grid, int i, int j) {
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 2;
        return getMaxLength(grid, i+1, j) +
               getMaxLength(grid, i-1, j) +
               getMaxLength(grid, i, j+1) +
               getMaxLength(grid, i, j-1) + 1;
    }
    
}
