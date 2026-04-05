class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int value : nums) {
            check.put(value, check.getOrDefault(value, 0) + 1);
        }
        for(int key : check.keySet()) {
            int frequency = check.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int ansIndex = 0;
        int[] ansArr = new int[k];
        for(int index = nums.length; index >= 0 && ansIndex < k; index--) {
            if(bucket[index] != null) {
                for(Integer value : bucket[index]) {
                    ansArr[ansIndex++] = value;
                }
            }
            
        }
        return ansArr;

    }
}
