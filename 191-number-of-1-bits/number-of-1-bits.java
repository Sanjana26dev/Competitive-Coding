class Solution {
    public int hammingWeight(int n) {
        int count = 0; 
        for(int i =0;i<32;i++){
            if (checkKthBit(n,i)==true){
                count++;
            }
        }
        return count;
        
    }
    static boolean checkKthBit(int n, int k)
    {
            if((n & (1<<k)) == 0){
                return false;
            }else{
                return true;
            }
    }
    
}