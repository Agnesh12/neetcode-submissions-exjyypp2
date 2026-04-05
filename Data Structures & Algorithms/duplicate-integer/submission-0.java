class Solution {
    public boolean hasDuplicate(int[] arr) {
            HashMap<Integer, Integer> ans = new HashMap();
            for(int num : arr) {
                if(ans.containsKey(num)) {
                    return true;
                }
                ans.put(num, 1);
            }
            return false;
    }
}
