class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] NewArr = new int[arr1.length + arr2.length];
        int LeftArr1 = 0;
        int RightArr1 = arr1.length;
        int LeftArr2 = 0;
        int RightArr2 = arr2.length;
        int Index = 0;
        while(LeftArr1 < RightArr1 && LeftArr2 < RightArr2) {
            if(arr1[LeftArr1] < arr2[LeftArr2]) {
                NewArr[Index++] = arr1[LeftArr1++];
            }
            else {
                NewArr[Index++] = arr2[LeftArr2++];
            }
        }
        while(LeftArr1 < RightArr1) {
            NewArr[Index++] = arr1[LeftArr1++];
        }
        while(LeftArr2 < RightArr2) {
            NewArr[Index++] = arr2[LeftArr2++];
        }
        double FinalAns = 0;
        int len = arr1.length + arr2.length;
        if(len % 2 == 0) {

            FinalAns = (NewArr[len / 2] + NewArr[(len / 2) - 1]) / 2.0; 
        }
        else {
            FinalAns = NewArr[(arr1.length + arr2.length) / 2];
        }
        return FinalAns;
    }
}
