class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
        
    }
    public void backtrack(List<List<Integer>> res,List<Integer> current,int[] nums,int target,int idx){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i =idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            if(target-nums[i]<0){
                break;
            }
            
            current.add(nums[i]);
            backtrack(res,current,nums,target-nums[i],i+1);
            current.remove(current.size()-1);
        }
    }
        
    
}