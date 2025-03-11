class Solution {
    private PriorityQueue<Integer> minheap;
    private int k;

    public int findKthLargest(int[] nums, int k) {
        int ans=0;
        this.k=k;
        this.minheap=new PriorityQueue<>(k);
        for(int num:nums){
            ans=add(num);
        }
        return ans;
    }
    public int add(int val){
        if(minheap.size()<k){
            minheap.offer(val);
        }
        else if(val> minheap.peek()){
            minheap.poll();
            minheap.offer(val);
        }
        return minheap.peek();
    }


}