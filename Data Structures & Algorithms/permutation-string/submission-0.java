class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Str = new int[26];
        int[] s2Str = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            s1Str[s1.charAt(i) - 'a']++;
        }
        int Left = 0;

        for(int Right = 0; Right < s2.length(); Right++) {
            s2Str[s2.charAt(Right) - 'a']++;
            while((Right - Left + 1) > s1.length() - 1) {
                if(Arrays.equals(s1Str,s2Str)) {
                    return true;
                }
                s2Str[s2.charAt(Left) - 'a']--;
                Left++;
            }
        }
        return false;
    }
}
