class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backtrack(res,nums,new ArrayList<>(),used);
        return res;

        
    }
    public void backtrack(List<List<Integer>> res,int[] nums,List<Integer> current,boolean[] used){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(!used[i]){
                current.add(nums[i]);
                used[i]=true;
                backtrack(res,nums,current ,used);
                used[i]=false;
                current.remove(current.size()-1);
            }
        }
    }
}