class Solution {
    public int missingNumber(int[] nums) {

        int n = 0;
        // To find the missing first we will add number from 0 to length of array 
        for(int i = 1; i <= nums.length; i++){
            n += i;
        }
        // We will now subtract all the elements of array so that missing no in array will remain as last 
        for(int i = 0; i < nums.length; i++){
            n -= nums[i];
        }
        return n;
    }
}
    