class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        List<Integer>[] bucket = new ArrayList[arr.length + 1];
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int num : arr) {
            check.put(num, check.getOrDefault(num, 0) + 1);
        }
        for(int key : check.keySet()) {
            int frequency = check.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            
                bucket[frequency].add(key);
            
        }
        int arrIndex = 0;
        int[] ansArr = new int[k];
        for(int index = arr.length; index >= 0 && arrIndex < k; index--) {
            if(bucket[index] != null) {
                for(Integer num : bucket[index]) {
                    ansArr[arrIndex++] = num;
                }
            }
        }
        return ansArr;
    }
}
