class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiralMat = new ArrayList<Integer>();
        int r=matrix.length;;
        int c=matrix[0].length;
        int startRow=0;
        int endRow=r-1;
        int startColumn=0;
        int endColumn=c-1;
        while(startRow<=endRow && startColumn<=endColumn)
    {
            //from the starting row
        for(int i=startColumn;i<=endColumn;i++)
        {
            spiralMat.add(matrix[startRow][i]);
        }
        startRow++;
        
           //from the ending column
        for(int i=startRow;i<=endRow;i++)
        {
            spiralMat.add(matrix[i][endColumn]);
        }
        endColumn--;
        
        if(startRow<=endRow)
        {
               //from the ending row
        for(int i=endColumn;i>=startColumn;i--)
        {
            spiralMat.add(matrix[endRow][i]);
        }
        endRow--;
        }
        
         if(startColumn<=endColumn)
        {
               //from the starting Column
        for(int i=endRow;i>=startRow;i--)
        {
            spiralMat.add(matrix[i][startColumn]);
        }
        startColumn++;
        }
    }
    return spiralMat;
    }
}
