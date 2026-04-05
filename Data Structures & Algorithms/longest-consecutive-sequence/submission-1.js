class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        let Length;
        let Longest = 0;
        const Setarr = new Set(nums);
        for(let value of Setarr ) {
            if(!Setarr.has(value - 1)) {
                Length = 1;
                while(Setarr.has(value + Length)) {
                    Length++;
                }
                Longest = Math.max(Longest, Length);

            }
        }
        return Longest;
    }
}
