class Solution {
    public int[] dailyTemperatures(int[] arrTemp) {
        int[] result = new int[arrTemp.length];
        Stack<Integer> check = new Stack<Integer>();
        for(int index = 0; index < arrTemp.length; index++) {
            while(!check.isEmpty() && arrTemp[check.peek()] < arrTemp[index]) {
                int resIndex = check.pop();
                result[resIndex] = index - resIndex;
            }
            check.push(index);
        }
        return result;
    }
}
