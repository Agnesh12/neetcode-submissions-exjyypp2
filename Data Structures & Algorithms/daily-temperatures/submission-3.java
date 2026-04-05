class Solution {
    static int[] WarmerDay(int[] arr) {
      Stack<Integer> check = new Stack();
      int[] output = new int[arr.length];
      for(int first = 0; first < arr.length; first++) {
        while(!check.isEmpty() && arr[check.peek()] < arr[first]) {
            int index = check.pop();
            output[index] = first - index;

        }
        check.push(first);
      }
      return output;
    }
    public int[] dailyTemperatures(int[] arr) {
    return WarmerDay(arr);
    }
}
