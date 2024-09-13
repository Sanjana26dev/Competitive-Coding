class Solution {
    public int jump(int[] nums) {
        int jump =0;
        int curmax=0;
        int curend=0;
        for(int i =0;i<nums.length-1;i++){
            curmax=Math.max(curmax,i+nums[i]);
            if(i==curend){
                jump++;
                curend=curmax;
            }
        }
        return jump;
        
    }
}