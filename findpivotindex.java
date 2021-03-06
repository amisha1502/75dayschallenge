class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0; i< nums.length; i++){
            int sumleft=0, sumright=0;
            for(int j=i+1; j<nums.length; j++){
                sumright+=nums[j];
            }
            for(int j=i-1; j>=0; j--){
                sumleft+=nums[j];
            }
            if(sumleft==sumright) {
                return i;
            }                      
        }        
        return -1; 
    }
}
