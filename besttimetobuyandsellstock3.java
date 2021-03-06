class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
    int dp[]=new int[n];
    
    Arrays.fill(dp,0);
    
    int maxValue=prices[n-1];
    
    for(int i=n-2;i>=0;i--){
        dp[i]=Math.max(dp[i+1],maxValue-prices[i]);
        maxValue=Math.max(maxValue,prices[i]);
    }
    
    int minValue=prices[0];
    
    for(int i=1;i<n;i++){
        dp[i]=Math.max(dp[i-1],dp[i]+prices[i]-minValue);
        minValue=Math.min(minValue,prices[i]);
    }
    
    return dp[n-1];

   }
}
