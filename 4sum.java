class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result= new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return result;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int rem= target-nums[i]-nums[j];
                int left=j+1;
                int right= n-1;
                while(left<right)
                {
                    int twosum= nums[left]+nums[right];
                    if(twosum<rem) left++;
                    else if(twosum>rem) right--;
                    else
                    {
                        List<Integer> quad= new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        result.add(quad);
                        
                        while(left<right && nums[left]==quad.get(2)) left++;
                        while(left<right && nums[right]==quad.get(3)) right--;
                    }
                }
                while(j+1<n && nums[j+1]==nums[j]) j++;
            }
            while(i+1<n && nums[i+1]==nums[i])i++;
        }
        return result;
    }
}
