class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        ArrayList<Character> list = new ArrayList<>();
        int c = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                list.add(chars[i]); 
                if (c > 1) { 
                    for (char digit : Integer.toString(c).toCharArray()) {
                        list.add(digit); 
                    }
                }
                c = 1; 
            } else {
                c++;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            chars[i] = list.get(i);
        }

        return list.size(); 
    }
}