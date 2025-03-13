class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length){
            return nums;
        }
        Map<Integer,Integer> count=new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->count.get(a)-count.get(b));
        for(int n:count.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=heap.poll();
        }
        return ans;
        
    }
}