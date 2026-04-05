class Solution {
    public int[] getConcatenation(int[] arr) {
        int[] NewArr = new int[arr.length + arr.length];
        int Index = 0;
        for(int num : arr) {
            NewArr[Index++] = num;
        }
        for(int num : arr) {
            NewArr[Index++] = num;
        }
        return NewArr;
    }
}