class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            max=Math.max(arr[i],max);
        }
        int index=0;
        for(int i=0; i<arr.length; i++)
        {
            if(max==arr[i]) index=i; 
        }
        
        return index;
    }
}
