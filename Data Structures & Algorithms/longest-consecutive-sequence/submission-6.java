class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for(int arr : nums) {
            check.add(arr);
        }
        int maxCount = 1;
        for(int num : nums) {
            int count = 1;
            while(check.contains(count + num)) {
                count++;
                maxCount = Math.max(maxCount, count);
            }
        }
        return (nums.length == 0) ? 0 : maxCount;
    }
}
