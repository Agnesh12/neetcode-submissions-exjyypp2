class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int[] S1Hash = new int[26];
      int[] S2Hash = new int[26];
      for(int i = 0; i < s1.length(); i++) {
        S1Hash[s1.charAt(i) - 'a']++;
      }
      int Left = 0;
      for(int Right = 0; Right < s2.length(); Right++) {
            S2Hash[s2.charAt(Right) - 'a']++;
            while((Right - Left + 1) > s1.length() - 1) {
                if(Arrays.equals(S1Hash, S2Hash)) {
                    return true;
                }
                S2Hash[s2.charAt(Left) - 'a']--;
                Left++;
            }
      }
      return false;
    }
}
