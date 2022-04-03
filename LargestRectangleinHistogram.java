class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stk=new Stack<>();
        int[] nsl=new int[n];
        
        for(int i=0;i<n;i++){
            if(stk.isEmpty()){
                nsl[i]=-1;
            }
            else if(!stk.isEmpty() && heights[stk.peek()]<heights[i]){
                nsl[i]=stk.peek();
            }
            else if(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    nsl[i]=-1;
                }
                else{
                    nsl[i]=stk.peek();
                }    
            }
            stk.push(i);
        }
        
        stk.clear();
        
        int[] nsr=new int[n];
        for(int i=n-1;i>=0;i--){
            if(stk.isEmpty()){
                nsr[i]=n;
            }
            else if(!stk.isEmpty() && heights[stk.peek()]<heights[i]){
                nsr[i]=stk.peek();
            }
            else if(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    nsr[i]=n;
                }
                else{
                    nsr[i]=stk.peek();
                }    
            }
            stk.push(i);
        }
        
        int[] width=new int[n];
        for(int i=0;i<n;i++){
            width[i]=nsr[i]-nsl[i]-1;
        }
        
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            al.add(heights[i]*width[i]);
        }
        
        int res=Collections.max(al);
        
        return res;
    }
}
