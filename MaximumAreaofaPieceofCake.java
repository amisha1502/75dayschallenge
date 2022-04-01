class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxH = Math.max(horizontalCuts[0]-0, h - horizontalCuts[horizontalCuts.length-1]);
        for (int i = 1;i<horizontalCuts.length; i++){
            int horizatalWidth = horizontalCuts[i] - horizontalCuts[i-1];
            maxH = Math.max(maxH, horizatalWidth);
        }
        
        int maxW = Math.max(verticalCuts[0]-0, w - verticalCuts[verticalCuts.length-1]);
        for (int i = 1;i<verticalCuts.length; i++){
            int verticalWidth = verticalCuts[i] - verticalCuts[i-1];
            maxW = Math.max(maxW, verticalWidth);
        }
        
        long ans = ((1L * maxH * maxW) % 1000000007);
        return  (int) (ans);
    }
}
