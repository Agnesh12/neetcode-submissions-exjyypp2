class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] S1Hash = new int[26];
       int[] S2Hash = new int[26];
       int Left = 0;
       for(int i = 0; i < s1.length(); i++) {
        S1Hash[s1.charAt(i) - 'a']++;
       }
       for(int i = 0; i < s2.length(); i++) {
        S2Hash[s2.charAt(i) - 'a']++;
        if((i - Left + 1) > s1.length() - 1) {
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
