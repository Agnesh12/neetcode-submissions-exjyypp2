class Solution {
    public int findDuplicate(int[] arr) {
        int Slow = 0;
        int Fast = 0;
        while(true) {
            Slow = arr[Slow];
            Fast = arr[arr[Fast]];
            if(Slow == Fast) {
                break;
            }
        }
        int Slow1 = 0;
        while(true) {
            Slow = arr[Slow];
            Slow1 = arr[Slow1];
            if(Slow == Slow1) {
                break;
            }
        }
        return Slow1;
    }
}
