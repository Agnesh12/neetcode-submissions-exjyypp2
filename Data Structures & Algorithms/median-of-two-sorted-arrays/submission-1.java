class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] Final = new int[arr1.length + arr2.length];
        int Index = 0;
        int i = 0;
        int j = 0;
        
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] > arr2[j]) {
                Final[Index++] = arr2[j++];
            }
            else {
                Final[Index++] = arr1[i++];
            }
        }
        while(i < arr1.length) {
            Final[Index++] = arr1[i++];
        }
        while(j < arr2.length) {
            Final[Index++] = arr2[j++];
        }
        int n = Final.length;
        if((Final.length % 2 == 1))  {
            return (double)Final[Final.length / 2];
        }
        else {
            return (double)(Final[n / 2] + Final[(n / 2) - 1]) / 2.0;
        }

    }
}
