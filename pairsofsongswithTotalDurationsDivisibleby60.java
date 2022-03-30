class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
        int[] modrem = new int[60];
        for(int i=0; i<time.length;i++)
        {
            if(time[i] % 60 == 0){count += modrem[0];}
            else{count += modrem[60 - time[i] % 60];}
            modrem[time[i] % 60] ++;
        }
        return count;
    }
}
