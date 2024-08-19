class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] sortedNums1 = nums1.clone(); // create a copy of nums1
        Arrays.sort(sortedNums1);

        int mod = (int) 1e9 + 7;
        int minDiff = 0, maxDiff = 0, sumDiff = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sumDiff = (sumDiff + diff) % mod;

            int j = Arrays.binarySearch(sortedNums1, nums2[i]);

            if (j < 0) {
                j = ~j;
            }

            if (j < nums1.length) {
                maxDiff = Math.max(maxDiff, diff - (sortedNums1[j] - nums2[i]));
            }

            if (j > 0) {
                maxDiff = Math.max(maxDiff, diff - (nums2[i] - sortedNums1[j - 1]));
            }
        }

        minDiff = (sumDiff - maxDiff + mod) % mod;

        return minDiff;
    }
}
