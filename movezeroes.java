class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        while(i<nums.length){
            if(nums[i]==0) i++;
            else{
                if(nums[i]!=0) {
                    swap(nums,i,j);
                    i++; j++;
                }
            }
        }
    }
    
    public static void swap(int[]nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
