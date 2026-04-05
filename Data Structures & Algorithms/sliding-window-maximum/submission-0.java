class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int Left = 0;
        int Right = k;
        int High = Integer.MIN_VALUE;
        List<Integer> Ans = new ArrayList();
        for(int i = 0; i < k; i++) {
            if(arr[i] > High) {
                High = arr[i];
            }
        }
        Ans.add(High);
        int Temp = 0;
        High = Integer.MIN_VALUE;
        while(Right < arr.length) {
            Left++;
            Temp = Left;
            while(Temp <= Right) {
                if(High < arr[Temp]) {
                    High = arr[Temp];
                }
                
                Temp++;
            }
            Ans.add(High);
            High = Integer.MIN_VALUE;
            Right++;
        }
        int[] StoreAns = new int[Ans.size()];
        int Start = 0;
        for(int Res : Ans) {
            StoreAns[Start++] = Res;
        }
        return StoreAns;
        
    }
}
