class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int index = 0; index < arr.length; index++) {
            int rem = target - arr[index];
            if(check.containsKey(rem)) {
                return new int[]{check.get(rem) + 1, index + 1};
            }
            check.put(arr[index], index);
        }
        return new int[]{};
    }
}
