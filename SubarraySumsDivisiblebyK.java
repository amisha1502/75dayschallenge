class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i-1];
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            int val = nums[i] % k;
            if(val < 0)
                val += k;
            if(map.containsKey(val)){
                int no = map.get(val);
                ans += no;
                map.put(val, no+1);
                continue;
            }
            map.put(val, 1);
        }
        return ans;
    }
}
