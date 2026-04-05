class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character, Integer> Frequency = new HashMap();
    int Max = 0;
    int Left = 0;
    int MaxLen = 0;
    for(int Right = 0; Right < s.length(); Right++) {
        char Ch = s.charAt(Right);
        Frequency.put(Ch, Frequency.getOrDefault(Ch, 0) + 1);
        Max = Math.max(Max, Frequency.get(Ch));
        while((Right - Left + 1) - Max > k) {
            Frequency.put(s.charAt(Left), Frequency.get(s.charAt(Left)) - 1);
            Left++;
        }
        MaxLen = Math.max(MaxLen, Right - Left + 1);
    }
    return MaxLen;
    }
}

