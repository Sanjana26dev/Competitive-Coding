class Solution {
    public class pair implements Comparable<pair>{
        int num;
        int idx;
        pair(int num , int idx){
            this.num = num;
            this.idx = idx;
        }
        public int compareTo(pair O){
            if(this.num != O.num) return this.num-O.num;
            else return this.idx-O.idx;
        }
        
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        pair[] arr=  new pair[n];
        for(int i = 0; i<n; i++){
            arr[i] = new pair(nums[i] ,i);
        }
        Arrays.sort(arr);
        
        int i = 0;
        int j = n-1;
        while(i<j){
            int left = arr[i].num;
            int right = arr[j].num;
            int sum = left+right;
         if(sum == target) return new int[]{arr[i].idx , arr[j].idx};
         else if(sum<target) i++;
            else j--;
        }
        return new int[2];
    }
}

