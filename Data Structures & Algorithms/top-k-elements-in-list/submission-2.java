public class Solution {
    public int[] topKFrequent(int[] arr, int len) {
      List<Integer>[] bucket = new ArrayList[arr.length + 1];
      HashMap<Integer, Integer> ArrFreq = new HashMap();
      for(int num : arr) {
            ArrFreq.put(num, ArrFreq.getOrDefault(num, 0) + 1);
      }
      int[] Ans = new int[len];
      for(int num : ArrFreq.keySet()) {
        int Frequency = ArrFreq.get(num);
        if(bucket[Frequency] == null) {
            bucket[Frequency] = new ArrayList();
        }
        bucket[Frequency].add(num);
      }
      int Count = 0;
      for(int i = bucket.length - 1; i >= 0 && Count < len; i--) {
        if(bucket[i] != null) {
            for(Integer num : bucket[i]) {
                Ans[Count++] = num;
            }
        }
        if(Count == len) {
            break;
        }
      }
      return Ans;
    }
}