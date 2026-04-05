class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character, Integer> ans = new HashMap();
      int Left = 0;
      int MaxLen = 0;
      int Max= 0;
      for(int Right = 0; Right < s.length();Right++) {
        char Ch = s.charAt(Right);
        ans.put(Ch, ans.getOrDefault(Ch, 0) + 1);
         Max = Math.max(Max, ans.get(Ch));
        while((Right - Left + 1) - Max > k) {
            ans.put(s.charAt(Left), ans.get(s.charAt(Left)) - 1);
            Left++;
        }
        MaxLen = Math.max(MaxLen, Right - Left + 1);

      }
      return MaxLen;
    }
}

