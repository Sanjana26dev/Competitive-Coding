class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<deck.length;i++){
            if(map.containsKey(deck[i])==false){
                map.put(deck[i],1);
            }
            else{
                int temp = map.get(deck[i]);
                map.put(deck[i],temp+1);
            }


        }
        int ans =0;
        for(int k : map.keySet()){
            ans=gcd(ans,map.get(k));
        }
        if(ans == 1){return false;}
        else{
            return true;
        }
         
        
    }
        int gcd(int a,int b){
            if(a==0){return b;}
            int temp = gcd(b%a,a);
            return temp;
        }
    

}