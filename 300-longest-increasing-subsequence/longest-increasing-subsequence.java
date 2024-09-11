class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] LIS=new int[nums.length];
        Arrays.fill(LIS,1);
        int max=1;
        for(int i=0;i<nums.length;i++){
            for(int j =0;j<i;j++){
                if(nums[i]>nums[j]){
                    LIS[i]=Math.max(LIS[i],1+LIS[j]);
                    max=Math.max(max,LIS[i]);
                }
            }
        }
        return max;
        
    }
}