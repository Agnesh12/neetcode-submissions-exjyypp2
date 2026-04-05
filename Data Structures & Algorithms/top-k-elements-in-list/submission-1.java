public class Solution {
    public int[] topKFrequent(int[] arr, int len) {
      
        List<Integer>[] bucket = new ArrayList[arr.length + 1];
        HashMap<Integer, Integer> result = new HashMap();
        for(int num : arr) {
            result.put(num, result.getOrDefault(num, 0) + 1);
        }
        for(int key : result.keySet()) {
            int frequency = result.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList();
            }
            bucket[frequency].add(key);
        }
        int counter = 0;
        int[] ans = new int[len];
        for(int pos = bucket.length - 1; pos >= 0 && counter < len; pos--) {
            if(bucket[pos] != null) {
                for(Integer integer : bucket[pos]) {
                    ans[counter++] = integer;
                }
                if(counter == len) {
                    break;
                }
            }
        }
        return ans;
    }
}