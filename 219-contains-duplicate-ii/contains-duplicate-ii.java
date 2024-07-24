class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> mp = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(mp.contains(nums[i])){
                return true;
            }
            mp.add(nums[i]);
            if(mp.size() > k){
                mp.remove(nums[i-k]);
            }
        }
        return false;
        
    }
}