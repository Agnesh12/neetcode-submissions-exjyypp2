class Solution {
    static int LongestSubString(String Str) {
        HashMap<Character, Integer> Index = new HashMap();
        int Right = 0;
        int Left = 0;
        int MaxLen = 0;
        while(Right < Str.length()) {
            if(Index.containsKey(Str.charAt(Right))) {
                Left = Math.max(Left, Index.getOrDefault(Str.charAt(Right), 0) + 1);
            }
            Index.put(Str.charAt(Right), Right);
            MaxLen = Math.max(MaxLen, Right - Left + 1);
            Right++;
        }
        return MaxLen;
    }
    public int lengthOfLongestSubstring(String s) {
      return LongestSubString(s);
    }
}
