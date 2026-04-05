class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int index = 0; index < arr.length; index++) {
            int remainder = target - arr[index];
            if(check.containsKey(remainder)) {
                return new int[]{check.get(remainder), index};
            }
            check.put(arr[index], index);
        }
        return new int[]{};
    }
}
