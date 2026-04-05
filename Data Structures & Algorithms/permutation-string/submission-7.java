class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1CharFreq = new int[26];
        int[] s2CharFreq = new int[26];
        for(char ch : s1.toCharArray()) {
            s1CharFreq[ch - 'a']++;
        }
        int left = 0;
        for(int right = 0; right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            s2CharFreq[rightChar - 'a']++;
            while((right - left + 1) >= s1.length()) {
                if(Arrays.equals(s1CharFreq, s2CharFreq)) {
                    return true;
                }
                char leftChar = s2.charAt(left);
                s2CharFreq[leftChar - 'a']--;
                left++;
            }
        }
        return false;
    }
}
