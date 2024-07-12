class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        int n = nums.length;
        map.put(0,1);
        int ans = 0;
        int[] PSum = Preffixsum(nums,n);
        for(int ep = 0 ; ep < n ; ep++){
            int diff = PSum[ep] - k;
            ans = ans + map.getOrDefault(diff , 0);
            map.put(PSum[ep],map.getOrDefault(PSum[ep],0)+1);
        }
        return ans;
        
    }
    public int[] Preffixsum( int[] arr, int n){
        int Pf[]=new int[n]; 
        Pf[0]=arr[0];
        for(int i = 1;i < n; i++){
            Pf[i]=Pf[i-1] + arr[i];
        }
        return Pf;

    }
}