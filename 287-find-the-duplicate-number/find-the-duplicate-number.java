class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)==true){
                int temp = map.get(n);
                map.put(n,temp+1);
            }
            else{
                map.put(n,1);
            }
        }
        for(Map.Entry<Integer,Integer> entri : map.entrySet()){
            if(entri.getValue() > 1){
                return entri.getKey();
            }
        }
        return -1;
    }
}