class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int[] output = new int[arr.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();
        int left = 0;
        int right = 0;
        while(right < arr.length) {
            while(!queue.isEmpty() && arr[right] > arr[queue.getLast()]) {
                queue.removeLast();
            }
            queue.addLast(right);
            if(left > queue.getFirst()) {
                queue.removeFirst();
            }
            if((right + 1) >= k) {
                output[left] = arr[queue.getFirst()];
                left++;
            }
            right++;

        }
        return output;
    }
}
