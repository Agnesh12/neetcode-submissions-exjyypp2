class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        List<Integer>[] bucket = new ArrayList[arr.length + 1];
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int value : arr) {
            check.put(value, check.getOrDefault(value, 0) + 1);
        }
        for(int key : check.keySet()) {
            int value = check.get(key);
            if(bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        }
        int[] ansIndex = new int[k];
        int tempIndex = 0;
        for(int index = arr.length; index >= 0 && tempIndex < k; index--) {
            if(bucket[index] != null) {
                for(Integer value : bucket[index]) {
                    ansIndex[tempIndex++] = value;
                }
            }
        }
        return ansIndex;
    }
}
