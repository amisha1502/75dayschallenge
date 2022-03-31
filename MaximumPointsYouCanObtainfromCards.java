class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] arraysum= new int[cardPoints.length];
        int sum=0;
        for(int i=0; i<cardPoints.length; i++)
        {
            sum+=cardPoints[i];
            arraysum[i]=sum;
        }
        
        if(cardPoints.length==k) return sum;
        
        int score=0;
        int ans=0;
        
        for(int i=0; i<=k; i++)
        {
            int j= i+cardPoints.length- k-1;
            if(i==0) ans=arraysum[j];
            else ans=arraysum[j]-arraysum[i-1];
            score= Math.max(score,sum-ans);
        }
        
        return score;
    }
}
