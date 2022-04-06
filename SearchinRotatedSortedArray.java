class Solution {
    public int search(int[] nums, int target) {
        int index=0;
        for(int i=0; i<nums.length; i++)
        {
            if(target==nums[i])
            {
                index=i;
                break;
            }
            else
                index=-1;
        }
        return index;
    }
}
