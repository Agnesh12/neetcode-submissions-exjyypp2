class Solution {
    public int lengthOfLongestSubstring(String s) {
    int MaxLen = 0;
    int Left = 0;
    HashMap<Character, Integer> Check = new HashMap<>();
    for(int Right = 0; Right < s.length(); Right++) {
        char Ch = s.charAt(Right);
        if(Check.containsKey(Ch)) {
            Left = Math.max(Left, Check.get(Ch) + 1);

        }
        Check.put(Ch, Right);
        MaxLen = Math.max(MaxLen, Right - Left + 1); 
    }
    return MaxLen;
    }
}
