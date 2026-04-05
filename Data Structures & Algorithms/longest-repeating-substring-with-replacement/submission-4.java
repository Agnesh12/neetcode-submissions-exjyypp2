class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> GMax = new HashMap();
        int Max = 0;
        int Left = 0;
        int Result = 0;
        for(int Right = 0; Right < s.length(); Right++) {
            char Char = s.charAt(Right);
            GMax.put(Char, GMax.getOrDefault(Char, 0) + 1);
            Max = Math.max(Max,GMax.get(Char));
            while((Right - Left + 1) - Max > k) {
                GMax.put(s.charAt(Left), GMax.get(s.charAt(Left)) - 1);
                Left++;
            }
            Result = Math.max(Result, Right - Left + 1);
        }
        return Result;
    }
}

