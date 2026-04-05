class Solution {
    public int lengthOfLongestSubstring(String s) {
        int Left = 0;
        int MaxLen = 0;
        HashMap<Character, Integer> Ans = new HashMap();
        for(int Right = 0; Right < s.length(); Right++) {
            char Ch = s.charAt(Right);
            if(Ans.containsKey(Ch)) {
                Left = Math.max(Left, Ans.get(Ch) + 1);
            }
            Ans.put(Ch, Right);
            MaxLen = Math.max(MaxLen, Right - Left + 1);
        }
        return MaxLen;
    }
}
