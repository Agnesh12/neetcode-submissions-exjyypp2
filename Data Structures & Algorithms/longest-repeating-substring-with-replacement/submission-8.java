class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> Check = new HashMap<>();
        int Left = 0;
        int MaxLen = 0;
        int Max = 0;
        for(int Right = 0; Right < s.length(); Right++) {
            char Ch = s.charAt(Right);
            Check.put(Ch, Check.getOrDefault(Ch, 0) + 1);
             Max = Math.max(Check.get(Ch), Max);
            while(((Right - Left + 1) - Max) > k) {
                char LeftChar = s.charAt(Left);
                Check.put(LeftChar, Check.get(LeftChar) - 1);
                Left++;
            }
            MaxLen = Math.max(MaxLen, Right - Left + 1);
        }
        return MaxLen;
    }
}
