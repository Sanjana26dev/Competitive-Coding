class Solution {
    public int missingNumber(int[] nums) {
        int rangesum=0;
        int numsum=0;
        for(int i =0;i<=nums.length;i++){
            rangesum+=i;
        }

        for(int i =0;i<nums.length;i++){
            numsum+=nums[i];
        }
        return rangesum-numsum;

    }

}
    