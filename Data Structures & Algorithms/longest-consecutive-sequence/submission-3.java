class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> Ans = new HashSet();
        for(int num : arr) {
            Ans.add(num);
        }
        int Length = 0;
        int MaxLength = 0;
        for(int num : arr) {
            if(!Ans.contains(num - 1)) {
                Length = 1;
                while(Ans.contains(num + Length)) {
                    Length++;
                }
                MaxLength = Math.max(Length, MaxLength);
            }
        }
        return MaxLength;
    }
}
