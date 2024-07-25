class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> ordermap = new HashMap<>();
        for(int i =0;i < order.length();i++){
            ordermap.put(order.charAt(i),i);
        }
        for(int i =0;i<words.length-1;i++){
            for(int j = 0;j<words[i].length();j++){
                if(j>=words[i+1].length()){
                    return false;
                }
                if(words[i].charAt(j)!=words[i+1].charAt(j)){
                    int currletter=ordermap.get(words[i].charAt(j));
                    int nextletter=ordermap.get(words[i+1].charAt(j));
                    if(nextletter < currletter){
                        return false;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return true;
    }
}