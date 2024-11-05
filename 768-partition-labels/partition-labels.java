class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastoccur=new int[26];
        for(int i=0;i<s.length();i++){

            lastoccur[s.charAt(i)-'a']=i;
        }
        List<Integer> result=new ArrayList<>();
        int partitionend=0;
        int partitionstart=0;
        for(int i =0;i<s.length();i++){
            partitionend=Math.max(partitionend,lastoccur[s.charAt(i)-'a']);
            if(i==partitionend){
                result.add(partitionend-partitionstart+1);
                partitionstart=i+1;

            }
        }
        return result;
        
    }
}