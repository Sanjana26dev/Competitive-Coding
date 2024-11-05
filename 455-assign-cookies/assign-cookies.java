class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieidx=0;
        int childidx=0;
        
        while(cookieidx<s.length && childidx <g.length){
            if(s[cookieidx] >=  g[childidx]){
                childidx++;
            }
            cookieidx++;
        }
        return childidx;
        
    }
}