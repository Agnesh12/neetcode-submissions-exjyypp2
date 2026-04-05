class Solution {
    public int largestRectangleArea(int[] arr) {
        int MaxArea = 0;
        Stack<Integer> NextGreat = new Stack();
        int[] LeftArr = new int[arr.length];
        int[] RightArr = new int[arr.length];
        for(int  i = 0; i < arr.length; i++) {
            LeftArr[i] = -1;
            while(!NextGreat.isEmpty() && arr[NextGreat.peek()] >= arr[i]) {
                NextGreat.pop();
            }
            if(!NextGreat.isEmpty()) {
                LeftArr[i] = NextGreat.peek();
            }
            NextGreat.push(i);
        }
        NextGreat.clear();
         for(int  i = arr.length - 1; i >= 0 ; i--) {
            RightArr[i] = arr.length;
            while(!NextGreat.isEmpty() && arr[NextGreat.peek()] >= arr[i]) {
                NextGreat.pop();
            }
            if(!NextGreat.isEmpty()) {
                RightArr[i] = NextGreat.peek();
            }
            NextGreat.push(i);
        }
        for(int i = 0; i < arr.length; i++) {
            int Area = RightArr[i] - LeftArr[i] - 1;
            int TotalArea = Area * arr[i];
            MaxArea = Math.max(MaxArea, TotalArea);
        }
        return MaxArea;

    }
}
