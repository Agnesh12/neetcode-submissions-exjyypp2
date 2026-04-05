class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> Frequency = new HashMap();
        int res = 0;
        for(int num : nums) {
            if(!(Frequency.containsKey(num))) {
                Frequency.put(num, Frequency.getOrDefault(num - 1, 0) + Frequency.getOrDefault(num + 1, 0) + 1);
                Frequency.put(num - Frequency.getOrDefault(num - 1, 0), Frequency.get(num));
                Frequency.put(num + Frequency.getOrDefault(num + 1, 0), Frequency.get(num));
            }
            res = Math.max(res, Frequency.get(num));
        }
        return res;
    }
}
