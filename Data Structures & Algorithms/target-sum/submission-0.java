class Solution {
    public int FindTarget(int[] arr, int index, int target, int sum) {
        if(index == arr.length) {
            return (sum == target) ? 1 : 0;
        }
        return FindTarget(arr, index + 1, target, sum + arr[index]) + FindTarget(arr, index + 1, target, sum - arr[index]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        return FindTarget(nums, 0, target, 0);
    }
}
