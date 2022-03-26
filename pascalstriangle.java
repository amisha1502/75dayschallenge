class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        if(numRows==0) return ans;
        
        List<Integer> row= new ArrayList<>();
        row.add(1);
        ans.add(row);
        
        for(int i=1; i<numRows; i++){
            List<Integer> prevrow= ans.get(i-1);
            List<Integer> currrow= new ArrayList<>();
            currrow.add(1);
            for(int j=1; j<i; j++){
                currrow.add(prevrow.get(j-1)+prevrow.get(j));
            }
            currrow.add(1);
            ans.add(currrow);
        }
        return ans;
    }
}
