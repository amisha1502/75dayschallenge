class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res= new int[2];
        res[1]=-1; res[0]=-1;
        if(nums==null || nums.length==0) return res;
        res[0]= searchindex(nums, target, true);
        res[1]= searchindex(nums, target, false);
        
        return res;
    }
    
    int searchindex(int[]nums, int target, boolean bool)
    {
        int low=0;
        int high= nums.length-1;
        int index=-1;
        
        while(low<=high)
        {
            int mid= low+(high-low)/2;
            if(nums[mid]==target)
            {
                if(bool)
                {
                    index=mid;
                    high=mid-1;
                }
                else
                {
                    index=mid;
                    low=mid+1;
                }
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        
        return index;
    }
}
