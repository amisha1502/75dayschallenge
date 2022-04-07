class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if (nums.length == 1) {
           return 0;
        } 
        else if (nums.length == 2) {
           return nums[0] > nums[1] ? 0 : 1;
        }
        while(low<=high)
        {
            int mid= low+(high-low)/2;
            if(mid>0 && mid<nums.length-1)
            {
                if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) return mid;
                else if(nums[mid-1]>nums[mid]) high=mid-1;
                else low=mid+1;
            }
            else if(mid==0)
            {
                if(nums[0]>nums[1])
                    return 0;
                else
                    return 1;
            }
            else if(mid==nums.length-1)
            {
                if(nums[nums.length-2]>nums[nums.length-1])
                    return nums.length-2;
                else
                    return nums.length-1;
            }
        }
        return -1;
    }
}
