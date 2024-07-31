class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> combination = new ArrayList<>();
        backtrack(target,res,combination,0, candidates);
        return res;
    }
    public void backtrack(int target,List<List<Integer>> res,List<Integer> combination,int start,int[] candidate){
        if(target==0){
            res.add(new ArrayList<Integer>(combination));

        }
        else if(target<0){
            return ;
        }
        for(int i =start;i<candidate.length;i++){
            combination.add(candidate[i]);
            backtrack(target-candidate[i],res,combination,i,candidate);
            combination.remove(combination.size()-1);
        }

    }

}