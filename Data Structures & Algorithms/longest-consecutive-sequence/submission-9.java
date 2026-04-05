class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> check = new HashSet<>();
        for (int num: arr) {
            check.add(num);
        }
        
        int maxLen = 0;
        
        for (int num: arr) {
            // start of sequence
            if (!check.contains(num - 1)) {
                int current = num;
                int consecutiveLen = 1;
                
                while (check.contains(current + 1)) {
                    current++;
                    consecutiveLen++;
                }
                
                maxLen = Math.max(maxLen, consecutiveLen);
            }
        }
        
        return maxLen;
    }
}
