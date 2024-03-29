class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] pfmax = new int[n];
        int[] sfmin = new int[n];
        pfmax[0]=arr[0];
        sfmin[n-1]=arr[n-1];
        for(int i = 1;i<n;i++ ){
            pfmax[i]=Math.max(pfmax[i-1],arr[i]);
        }
        for(int i = n-2;i>=0;i--){
            sfmin[i]=Math.min(sfmin[i+1],arr[i]);

        }
        int ans=0;
        for(int i =0;i<n-1;i++){
            if(pfmax[i]<=sfmin[i+1]){
                ans++;
            }
            
        }
        ans++;
        return ans;

        
    }
}