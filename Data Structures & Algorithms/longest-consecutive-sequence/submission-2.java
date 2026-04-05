class Solution {
    public int longestConsecutive(int[] arr) {
       HashSet<Integer> Ans = new HashSet();
       int MaxLen = 0;
        for(int num : arr) {
            Ans.add(num);
        }
       for(int num : arr) {
        
        if(!Ans.contains(num - 1)) {
            int Length = 1;
            while(Ans.contains(num + Length)) {
                Length++;
            }
            MaxLen = Math.max(MaxLen, Length);
        }
       }
       return MaxLen;
    }
}
