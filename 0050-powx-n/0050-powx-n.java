class Solution {
    public double myPow(double x, long n) {
        int ans=1;
        if(n==1){
            return x;
        }
        if(n==0){
            return 1.0;
        }
        if(n<0){
            x=1/x;
            n=n*-1;
        }
        double temp= myPow(x, n/2);
        if(n%2==0){
            return temp*temp;
        }
        if(n%2!=0){
            return x*temp*temp;
        }
        return (double)(x*myPow(x,n-1));
    }
}