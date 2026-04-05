class Solution {
    public int largestRectangleArea(int[] arr) {
     Stack<Integer> Index = new Stack();
     int[] LeftArr = new int[arr.length];
     int[] RightArr = new int[arr.length];
     int MaxWidth = 0;
     for(int i = 0; i < arr.length; i++) {
        LeftArr[i] = -1;
        while(!Index.isEmpty() && arr[Index.peek()] >= arr[i]) {
            Index.pop();
        }
        if(!Index.isEmpty()) {
            LeftArr[i] = Index.peek();
        }
        Index.push(i);
     }
     Index.clear();
     for(int i = arr.length - 1; i >= 0; i--) {
        RightArr[i] = arr.length;
        while(!Index.isEmpty() && arr[Index.peek()] >= arr[i]) {
            Index.pop();
        }
        if(!Index.isEmpty()) {
            RightArr[i] = Index.peek();
        }
        Index.push(i);
     }
     for(int i = 0; i < arr.length; i++) {
            int Area = RightArr[i] - LeftArr[i] - 1;
            int Width = Area * arr[i];
            MaxWidth = Math.max(Width, MaxWidth);
     }
     return MaxWidth;

    }
}
