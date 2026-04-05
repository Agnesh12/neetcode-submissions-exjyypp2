class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charFreq = new int[26];
        for(char ch : s.toCharArray()) {
            charFreq[ch - 'a']++;
        }
        for(char ch : t.toCharArray()) {
            charFreq[ch - 'a']--;
        }
        for(int index = 0; index < 26; index++) {
            if(charFreq[index] != 0) {
                return false;
            }
        }
        return true;
    }
}
