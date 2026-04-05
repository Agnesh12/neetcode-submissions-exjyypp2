class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        for(char ch : s1.toCharArray()) {
            s1Freq[ch - 'a']++;
        }
        int left = 0;
        for(int right = 0; right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            s2Freq[rightChar - 'a']++;
            while((right - left + 1) > s1.length() - 1) {
                if(Arrays.equals(s1Freq, s2Freq)) {
                    return true;
                }
                char leftChar = s2.charAt(left);
                s2Freq[leftChar - 'a']--;
                left++;
            }
        }
        return false;
    }
}
