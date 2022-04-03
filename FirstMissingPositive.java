class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> number= new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            number.add(nums[i]);
        }
        int n=1;
        while(n<=nums.length)
        {
            if(!number.contains(n))
                break;
            
            n++;
        }
        
        return n;
    }
}
