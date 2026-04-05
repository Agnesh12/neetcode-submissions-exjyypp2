class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        List<Integer>[] bucket = new ArrayList[arr.length + 1];
        HashMap<Integer, Integer> frequency = new HashMap();
        for(int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for(int key : frequency.keySet()) {
            int Frequency = frequency.get(key);
            if(bucket[Frequency] == null) {
                bucket[Frequency] = new ArrayList();
            }
            bucket[Frequency].add(key);
        }
        int counter = 0;
        int[] ans = new int[k];
        for(int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if(bucket[i] != null) {
                for(Integer integer : bucket[i]) {
                ans[counter++] = integer;
                }
            }
            if(counter == k) {
                break;
            }
        }
        return ans;
    }
}
