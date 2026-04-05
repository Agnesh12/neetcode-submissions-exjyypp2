class Solution {
    public void AllSubset(List<List<Integer>> result, List<Integer> temp,int[] arr, int tempIndex) {

        result.add(new ArrayList<>(temp));
        for(int index = tempIndex; index < arr.length; index++) {
            temp.add(arr[index]);
            AllSubset(result, temp, arr, index + 1);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        AllSubset(result, new ArrayList<>(), nums, 0);
        return result;
    }
}
