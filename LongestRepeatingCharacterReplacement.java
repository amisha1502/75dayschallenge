class Solution {
    public int characterReplacement(String s, int k) {
        int max_count =0;
        int max_length=0,start=0;
        int [] array = new int [26];
        
        for(int end =0;end <s.length();end++){
        
        array[s.charAt(end)-'A']++;
        max_count =Math.max(max_count, array[s.charAt(end)-'A']);
        
        while(end -start-max_count+1>k){
            array[s.charAt(start)-'A']--;
            start++;
        }
        
        max_length=Math.max(max_length,end -start+1);
     }
     return max_length;
    }
}
