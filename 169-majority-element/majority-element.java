class Solution {
    public Map<Integer,Integer> countNums(int[] nums){
        Map<Integer,Integer> counts=new HashMap<Integer,Integer>();
        for(int num:nums){
            if(!counts.containsKey(num)){
                counts.put(num,1);
            }else{
                counts.put(num,counts.get(num)+1);
            }

        }
        return counts;

    }
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counts=countNums(nums);

        Map.Entry<Integer,Integer> majorityelement=null;
        for(Map.Entry<Integer,Integer> entry:counts.entrySet()){
            if(majorityelement==null|| entry.getValue()>majorityelement.getValue()){
                majorityelement=entry;
            }
        }
        return majorityelement.getKey();

        
    }
}