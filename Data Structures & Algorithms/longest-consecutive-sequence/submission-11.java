class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> check = new HashSet();
        for(int value : nums) {
            check.add(value);
        }
        int maxLen = 0;
        for(int value : check) {
            if(!check.contains(value - 1)) {
                int len = 1;
                while(check.contains(value + len)) {
                    len++;
                }
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}
