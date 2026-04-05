class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> check = new HashSet<>();
        for(int num : arr) {
            check.add(num);
        }
        int consecutiveLen = 0;
        for(Integer num : check) {
            
            if(!check.contains(num - 1)) {
                int len = 1;
                while(check.contains(num + len)) {
                    len++;
                }
                consecutiveLen = Math.max(consecutiveLen, len);
            }
        }
        return consecutiveLen;
    }
}
