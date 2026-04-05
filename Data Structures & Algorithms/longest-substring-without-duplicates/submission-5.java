class Solution {
    static int LongestSubString(String Str) {
      int Left = 0;
      int MaxLen = 0;
      HashMap<Character, Integer> Index = new HashMap();
      for(int Right = 0; Right < Str.length(); Right++) {
        if(Index.containsKey(Str.charAt(Right))) {
            Left = Math.max(Left, Index.get(Str.charAt(Right)) + 1);
        }
        Index.put(Str.charAt(Right), Right);
        MaxLen = Math.max(MaxLen, Right - Left + 1);
      }
      return MaxLen;
    }
    public int lengthOfLongestSubstring(String s) {
      return LongestSubString(s);
    }
}
