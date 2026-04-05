class Solution {
    static int LongestSubString(String Str) {
       HashMap<Character, Integer> DupCheck = new HashMap();
       int Left = 0;
       int MaxLen = 0;
       for(int Right = 0; Right < Str.length(); Right++) {
        char Char = Str.charAt(Right);
        if(DupCheck.containsKey(Char)) {
            Left = Math.max(Left, DupCheck.get(Char) + 1);
        }
        DupCheck.put(Char, Right);
        MaxLen = Math.max(MaxLen, Right - Left + 1);
        
       }
       return MaxLen;
    }
    public int lengthOfLongestSubstring(String s) {
      return LongestSubString(s);
    }
}
