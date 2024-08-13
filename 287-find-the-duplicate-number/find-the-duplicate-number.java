class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> Set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(Set.contains(nums[i])){
                return nums[i];
            }
            else{
                Set.add(nums[i]);
            }
        }
        return -1;
    }
    
        
}