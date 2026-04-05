class Solution {
    static int LongestSubString(String Str) {
        HashMap<Character, Integer> Result = new HashMap();
        int Right = 0;
        int Left = 0;
        int MaxLen = 0;
        while(Right < Str.length()) {
            if(Result.containsKey(Str.charAt(Right))) {
                Left = Math.max(Result.get(Str.charAt(Right)) + 1, Left);
            }
            Result.put(Str.charAt(Right), Right);
            MaxLen = Math.max(MaxLen, Right - Left + 1);
            Right++;

        }
        return MaxLen;
    }
    public int lengthOfLongestSubstring(String s) {
        return LongestSubString(s);
    }
}
