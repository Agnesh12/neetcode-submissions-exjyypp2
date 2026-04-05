class Solution {
    public boolean checkInclusion(String s1, String s2) {
     int[] S1Hash = new int[26];
     int[] S2Hash = new int[26];
     for(char Ch : s1.toCharArray()) {
        S1Hash[Ch - 'a']++;
     }
     int Left = 0;
     for(int Right = 0; Right < s2.length(); Right++) {
        char Ch = s2.charAt(Right);
        S2Hash[Ch - 'a']++;
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
