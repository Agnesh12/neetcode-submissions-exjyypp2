class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> Check = new HashMap<>();
        int MaxLen = 0;
        int Max = 0;
        int Left = 0;
        for(int Right = 0; Right < s.length() ; Right++ ) {
            char Ch = s.charAt(Right);
            Check.put(Ch, Check.getOrDefault(Ch, 0) + 1);
            Max = Math.max(Max, Check.get(Ch));
            while(((Right - Left + 1) - Max) > k) {
                Check.put(s.charAt(Left), Check.get(s.charAt(Left)) - 1);
                Left++;
            }
            MaxLen = Math.max(MaxLen, Right - Left + 1);
        }
        return MaxLen;
    }
}
