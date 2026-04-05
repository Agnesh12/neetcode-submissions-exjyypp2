class Solution {
    public boolean hasDuplicate(int[] arr) {
            HashMap<Integer, Integer> Check = new HashMap();
            for(int num : arr) {
                if(Check.containsKey(num)) {
                    return true;
                }
                Check.put(num, 1);
            }
            return false;
    }
}
