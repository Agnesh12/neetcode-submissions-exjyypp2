class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> check = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if(check.containsKey(rightChar)) {
                left = Math.max(left, check.get(rightChar) + 1);
            }
            check.put(rightChar, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
