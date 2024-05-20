class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1.0;
        double ans = 1.0;
        long nn = n;
        if(nn < 0){
            nn = -nn;
            x = 1.0 / x;
        }
        
        while(nn > 0){
            if(nn % 2 == 0){
                x = x * x;
                nn = nn / 2;
            }
            if(nn % 2 != 0){
                ans = ans * x;
                nn--;
            }
        }
        return ans;
    }
}