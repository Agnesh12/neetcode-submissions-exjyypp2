class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> check = new HashSet();
        for(int num : arr) {
            if(check.contains(num)) {
                return true;
            }
            check.add(num);
        }
        return false;
    }
}