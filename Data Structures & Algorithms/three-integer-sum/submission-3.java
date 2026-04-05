class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
   List<List<Integer>> Ans = new ArrayList();
   Arrays.sort(arr);
   int Sum = 0;
   for(int i = 0; i < arr.length - 2; i++) {
    if(i != 0 && arr[i] == arr[i - 1]) {
        continue;
    }
    int j = i + 1;
    int k = arr.length - 1;
    while(j < k) {
        Sum = arr[i] + arr[j] + arr[k];
        if(Sum > 0) {
            k--;
        }
        else if(Sum < 0) {
            j++;
        }
        else {
            Ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
            j++;
            k--;
            while(j < k && arr[j] == arr[j - 1]) {
                j++;
            }
            while(j < k && arr[k] == arr[k + 1]) {
                k--;
            }
        }

    }
   }
   return Ans;
    }
    }
    