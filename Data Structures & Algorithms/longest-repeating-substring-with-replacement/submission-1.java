class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> Count = new HashMap();
        int Right = 0;
         int Left = 0;
         int MaxCount = 0;
         int MaxLen = 0;
         for(Right = 0; Right < s.length(); Right++) {
            Count.put(s.charAt(Right), Count.getOrDefault(s.charAt(Right), 0) + 1);
            MaxCount = Math.max(MaxCount, Count.get(s.charAt(Right)));
            while((Right - Left + 1) - MaxCount > k) {
                Count.put(s.charAt(Left), Count.get(s.charAt(Left)) - 1);
                Left++;
            }
            MaxLen = Math.max(MaxLen, Right - Left + 1);
         }
         return MaxLen;
    }
}
