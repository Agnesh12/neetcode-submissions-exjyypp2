class Solution {
    public int[] productExceptSelf(int[] arr) {
      int[] LeftArr = new int[arr.length];
      int[] RightArr = new int[arr.length];
      LeftArr[0] = 1;
      for(int i = 1; i < arr.length; i++) {
        LeftArr[i] = arr[i - 1] * LeftArr[i - 1];
      }
      RightArr[arr.length - 1] = 1;
      for(int i = arr.length - 2; i >= 0; i--) {
        RightArr[i] = RightArr[i + 1] * arr[i + 1];
      }
      int[] Ans = new int[arr.length];
      for(int i = 0; i < arr.length; i++) {
        Ans[i] = LeftArr[i] * RightArr[i];
      }
      return Ans;
    }
}  
