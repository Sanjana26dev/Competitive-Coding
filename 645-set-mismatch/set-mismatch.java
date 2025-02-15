class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int miss =0;
        int dup=0;
        for(int i =0;i<nums.length;i++){
            if(!set.add(nums[i])){
                dup=nums[i];
            }
        }
        for(int i =1;i<=nums.length;i++){
            if(!set.contains(i)){
                miss=i;
            }
        }
        return new int[]{dup,miss};
        
    }
}