class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int num : arr) {
            if(check.containsKey(num)) {
                return true;
            }
            check.put(num, check.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}