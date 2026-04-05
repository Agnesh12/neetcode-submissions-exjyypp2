class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for(int first = 0; first < arr.length - 2; first++) {
            if(first != 0 && arr[first] == arr[first - 1]) {
                continue;
            }
            int second = first + 1;
            int last = arr.length - 1;
            while(second < last) {
                int sum = arr[first] + arr[second] + arr[last];
                if(sum > 0) {
                    last--;
                }
                else if(sum < 0) {
                    second++;
                }
                else {
                    result.add(Arrays.asList(arr[first], arr[second], arr[last]));
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
        return result;
    }
}
