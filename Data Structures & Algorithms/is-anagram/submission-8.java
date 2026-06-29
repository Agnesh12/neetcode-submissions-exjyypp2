class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=  t.length()) {
            return false;
        }
        int[] checkAna = new int[26];
        for(int index = 0; index < s.length(); index++) {
            checkAna[s.charAt(index) - 'a']++;
            checkAna[t.charAt(index) - 'a']--;
        }
        for(int index = 0; index < 26; index++) {
            if(checkAna[index] != 0) {
                return false;
            }
        }
        return true;
     }
}
