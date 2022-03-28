class Solution {
    public int maxArea(int[] height) {
        int waterin=0;
        int start=0;
        int end=height.length-1;
        
        while(start<end){
           if(height[start]<height[end]){
                waterin=Math.max(waterin,height[start]*(end-start));
                start++;
            }
           else{
               waterin=Math.max(waterin,height[end]*(end-start));
               end--;
           }
        }
        return waterin;
    }
}
