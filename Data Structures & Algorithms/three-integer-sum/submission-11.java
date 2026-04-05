class Solution {
    public void getThreeSum(List<List<Integer>> result, int[] arr) {
        for(int index = 0; index < arr.length - 2; index++) {
            if(index != 0 && arr[index] == arr[index - 1]) {
                continue;
            }
            int sum = 0;
            int left = index + 1;
            int right = arr.length - 1;
            while(left < right) {
                sum = arr[index] + arr[left] + arr[right];
                if(sum > 0) {
                    right--;
                }
                else if( sum < 0) {
                    left++;
                }
                else {
                    result.add(Arrays.asList(arr[index], arr[left], arr[right]));
                    left++;
                    right--;
                    while(left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while(left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        getThreeSum(result, arr);
        return result;
    }
}
