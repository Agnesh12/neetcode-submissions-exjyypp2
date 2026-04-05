class Solution {
    public int largestRectangleArea(int[] arr) {
        int[] LeftArr = new int[arr.length];
        int[] RightArr = new int[arr.length];
        Stack<Integer> Manipulate = new Stack();
        for(int i = 0; i < arr.length; i++) {
            LeftArr[i] = -1;
            while(!Manipulate.isEmpty() && arr[Manipulate.peek()] >= arr[i] ) {
                Manipulate.pop();
            }
            if(!Manipulate.isEmpty()) {
                LeftArr[i] = Manipulate.peek();
            }
            Manipulate.push(i);
        }
        Manipulate.clear();
        for(int i = arr.length - 1; i >= 0; i--) {
            RightArr[i] = arr.length;
            while(!Manipulate.isEmpty() && arr[i] <= arr[Manipulate.peek()]) {
                Manipulate.pop();
            }
            if(!Manipulate.isEmpty()) {
                RightArr[i] = Manipulate.peek();
            }
            Manipulate.push(i);
        }
        int MaxRectangle = 0;
        for(int i = 0; i < arr.length; i++) {
            int Width = RightArr[i] - LeftArr[i] - 1;
            int Area = arr[i] * Width;
            MaxRectangle = Math.max(MaxRectangle, Area);
        }
        return MaxRectangle;
    }
}
