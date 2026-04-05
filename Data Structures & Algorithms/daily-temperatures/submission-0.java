class Solution {
    static int[] WarmerDay(int[] arr) {
        int[] Ans = new int[arr.length];
        int Index = 0;
        Stack<Integer> StIndex = new Stack();
        for(int i = 0; i < arr.length; i++) {
            while(!StIndex.isEmpty() && arr[i] > arr[StIndex.peek()]) {
                Index = StIndex.pop();
                Ans[Index] = i - Index;
            }
            StIndex.push(i);
        }
        return Ans;
    }
    public int[] dailyTemperatures(int[] arr) {
    return WarmerDay(arr);
    }
}
