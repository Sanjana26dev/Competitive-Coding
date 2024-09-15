class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generatesubsets(0,nums,new ArrayList<>(),res);
        return res;
        
    }
    public void generatesubsets(int index,int[] nums, List<Integer> current,List<List<Integer>> res){
        res.add(new ArrayList<>(current));
        for(int i =index;i<nums.length;i++){
            current.add(nums[i]);
            generatesubsets(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    }
}