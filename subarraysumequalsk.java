class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int currsum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            currsum+=nums[i];
            if(currsum==k){
                count++;
            }
            if(map.containsKey(currsum-k)){
                count+=map.get(currsum-k);
            }
            map.put(currsum,1);
        }
        return count;
    }
}
