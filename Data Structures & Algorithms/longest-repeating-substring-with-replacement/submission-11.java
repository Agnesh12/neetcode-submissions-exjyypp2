class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> check = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            check.put(rightChar, check.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, check.get(rightChar));
            while(((right - left + 1) - maxFreq) > k) {
                char leftChar = s.charAt(left);
                check.put(leftChar, check.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }   
        return maxLen;
    }
}
