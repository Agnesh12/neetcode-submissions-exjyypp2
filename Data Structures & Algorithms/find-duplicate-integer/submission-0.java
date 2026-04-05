class Solution {
    public int findDuplicate(int[] arr) {
        HashMap<Integer, Integer> Frequency = new HashMap();
        for(int num : arr) {
            if(Frequency.containsKey(num)) {
                return num;
            }
            Frequency.put(num, 1);
        }
        return 0;
    }
}
