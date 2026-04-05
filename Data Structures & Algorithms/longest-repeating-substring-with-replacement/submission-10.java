class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> check = new HashMap<>();
        int currentMax = Integer.MIN_VALUE;
        int left = 0;
        int maxLen = 0;
        for(int index = 0; index < s.length(); index++) {
            char currentChar = s.charAt(index);
            check.put(currentChar, check.getOrDefault(currentChar, 0) + 1);
            currentMax = Math.max(currentMax, check.get(currentChar));
            while((index - left + 1) - currentMax > k) {
                char leftChar = s.charAt(left);
                check.put(leftChar, check.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, index - left + 1);
        }
        return maxLen;
    }
}
