class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len1 + len2];
        int nums1Index = 0;
        int nums2Index = 0;
        int Index = 0;
        while(nums1Index < len1 && nums2Index < len2) {
            if(nums1[nums1Index]< nums2[nums2Index]) {
                result[Index++] = nums1[nums1Index++];
            }
            else {
                result[Index++] = nums2[nums2Index++];
            }
        }
        while(nums1Index < len1) {
            result[Index++] = nums1[nums1Index++];
        }
        while(nums2Index < len2) {
            result[Index++] = nums2[nums2Index++];
        }
        double finalResult = 0;
        int resLen = len1 + len2;
        if((resLen % 2) == 1) {
            finalResult = result[resLen / 2];
        }
        else {
            finalResult = (result[resLen / 2] + result[resLen / 2 - 1]) / 2.0;
        }
        return finalResult;
    }
}
