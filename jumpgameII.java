class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int current=0;
        int maximum=0;
        
        for(int i=0; i<nums.length-1; i++)
        {
            maximum= Math.max(maximum, nums[i]+i);
            if(i==current)
            {
                current=maximum;
                jumps++;
            }
        }
        return jumps;
    }
}
