class KthLargest {
    private PriorityQueue<Integer> minheap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.minheap=new PriorityQueue<>(k);
        this.k=k;
        for(int num:nums){
            add(num);
        }
        
        
    }
    
    public int add(int val) {
        
            if(minheap.size()<k){
                minheap.offer(val);
            }
            else if(val>minheap.peek()){
                minheap.poll();
                minheap.offer(val);
            }
        
        return minheap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */