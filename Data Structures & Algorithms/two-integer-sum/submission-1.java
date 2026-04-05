class Solution {
    public int[] twoSum(int[] arr, int target) {
      HashMap<Integer, Integer> Ans = new HashMap();
      int Rem = 0;
      for(int i = 0; i < arr.length; i++) {
        Rem = target - arr[i];
        if(Ans.containsKey(Rem)) {
            return new int[]{Ans.get(Rem), i};
        }
        Ans.put(arr[i], i);
      }
      return new int[]{};
    }
}
