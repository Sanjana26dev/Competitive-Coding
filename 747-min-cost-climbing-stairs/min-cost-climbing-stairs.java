class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        if(n==0) return 0;
        if(n==1) return 1;
        int prev1=cost[0];
        int prev2=cost[1];
        for(int i =2;i<cost.length;i++){
            int curr=cost[i] + Math.min(prev1,prev2);
            prev1=prev2;
            prev2=curr;
        }
        return Math.min(prev1,prev2);
        
    }
}