class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
        
    }
    public void backtrack(List<List<Integer>> res,List<Integer> current,int[] nums,int idx){
        res.add(new ArrayList<>(current));
        for(int i =idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            
            current.add(nums[i]);
            backtrack(res,current,nums,i+1);
            current.remove(current.size()-1);
        }
    }
}