class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(target,res,combination,0,candidates);
        return res;
    }
    public void backtrack(int target,List<List<Integer>> res,List<Integer> combination,int start,int[] candidates){
        if(target==0){
            res.add(new ArrayList<Integer>(combination));

        }
        else if(target<0){
            return;
        }
        else{
            for(int i=start;i<candidates.length;i++){
                combination.add(candidates[i]);
                backtrack(target-candidates[i],res,combination,i,candidates);
                combination.remove(combination.size()-1);
            }
        }
    }
}