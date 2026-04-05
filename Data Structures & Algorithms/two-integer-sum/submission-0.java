class Solution {
    public int[] twoSum(int[] arr, int target) {
        int rem = 0;
        HashMap<Integer, Integer> Index = new HashMap();
        for(int i = 0; i < arr.length; i++) {
            rem = target - arr[i];
            if(Index.containsKey(rem)) {
                return new int[]{Index.get(rem), i};
            }
            else {
                Index.put(arr[i], i);
            }
        }
        return new int[]{};
    }
}
