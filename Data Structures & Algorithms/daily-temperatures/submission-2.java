class Solution {
    public int[] dailyTemperatures(int[] arr) {
       Stack<Integer> Index = new Stack();
       int[] Ans = new int[arr.length];
       for(int i  = 0; i < arr.length; i++) {
            while(!Index.isEmpty() && arr[Index.peek()] < arr[i]) {
                int Value = Index.pop();
                Ans[Value] = i - Value;
            }
            Index.push(i);
       } 
       return Ans;
    }
}
