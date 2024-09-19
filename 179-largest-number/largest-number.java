class Solution {
    public String largestNumber(int[] nums) {
        String[] asStr= new String[nums.length];
        for(int i =0;i<nums.length;i++){
            asStr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort( asStr,new Comparator<>(){
            public int compare(String a,String b){
                String order1=a+b;
                String order2=b+a;
                 return order2.compareTo(order1);
            }
        });
        if(asStr[0].equals("0")){
            return "0";
        }
        StringBuilder largestnumstr= new StringBuilder();
        for(String numstr:asStr){
            largestnumstr.append(numstr);
        }
        return largestnumstr.toString();
    }
}