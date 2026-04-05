class Solution {
    static int LongestSubString(String Str) {
       int MaxLen = 0;
       HashMap<Character, Integer> Check = new HashMap();
       int Left = 0;
       for(int Right = 0; Right < Str.length(); Right++) {
            char Ch = Str.charAt(Right);
            if(Check.containsKey(Ch)) {
                Left = Math.max(Left, Check.get(Ch) + 1);
            }
            Check.put(Ch, Right);
            MaxLen = Math.max(MaxLen, Right - Left + 1);
            
       }
       return MaxLen;
    }
    public int lengthOfLongestSubstring(String s) {
      return LongestSubString(s);
    }
}
