class Solution {
    public int minSubArrayLen(int target, int[] nums){
    int windowSum = 0, minLength = Integer.MAX_VALUE, start = 0;
    for (int end = 0; end < nums.length; end++) {
    windowSum += nums[end];
        while (windowSum >= target) {
        minLength = Math.min(minLength, end - start + 1);
        windowSum -= nums[start++];
        }
    }
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
        
    }
}