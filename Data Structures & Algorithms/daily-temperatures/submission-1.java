class Solution {
    static int[] WarmerDay(int[] arr) {
        int[] newArr = new int[arr.length];
        Stack<Integer> Index = new Stack();
        int Temp = 0;
        for(int i = 0; i < arr.length; i++) {
            while(!Index.isEmpty() && arr[i] > arr[Index.peek()]) {
                Temp = Index.pop();
                newArr[Temp] = i - Temp;
            }
            Index.push(i);
        }
        return newArr;
    }
    public int[] dailyTemperatures(int[] arr) {
    return WarmerDay(arr);
    }
}
