class Solution {
    public void FindThreeSum(int[] arr, List<List<Integer>> result) {
        for(int index = 0; index < arr.length - 2; index++) {
            if(index != 0 && arr[index] == arr[index - 1]) {
                continue;
            }
            int second = index + 1;
            int last = arr.length - 1;
            int sum = 0;
            while(second < last) {
                sum = arr[index] + arr[second] + arr[last];
                if(sum > 0) {
                    last--;
                }
                else if(sum < 0) {
                    second++;
                }
                else {
                    result.add(new ArrayList<>(Arrays.asList(arr[index], arr[second], arr[last])));
                    second++;
                    last--;
                    while(second < last && arr[second] == arr[second - 1]) {
                        second++;
                    }
                    while(second < last && arr[last] == arr[last + 1]) {
                        last--;
                    }
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        FindThreeSum(nums, result);
        return result;
    }
}
