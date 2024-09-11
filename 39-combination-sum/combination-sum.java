class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(target, candidates, 0, new ArrayList<>(), combinations);
        return combinations;
    }
    
    private void backtrack(int target, int[] candidates, int index, List<Integer> combination, List<List<Integer>> combinations) {
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if (target < 0 || index >= candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]);
            backtrack(target - candidates[i], candidates, i, combination, combinations);
            combination.remove(combination.size() - 1);
        }
    }
}
