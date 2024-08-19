class Solution {
    public int getnext(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            n=n/10;
            sum+=d*d;
        }
        return sum;

    }
    public boolean isHappy(int n) {
        int slow =n;
        int fast = getnext(n);
        while(fast!=1 && slow!=fast){
            slow=getnext(slow);
            fast = getnext(getnext(fast));
        }
        return fast==1;
        
    }
}