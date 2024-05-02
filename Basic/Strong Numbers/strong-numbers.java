//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isStrong(int n) {
        // code here
        int sum = 0;
        for(int i = n; i > 0; i /= 10){
            sum += fact(i % 10);
        }
        if (sum == n)
            return 1;
        else 
            return 0;
    }
    static int fact(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        return x*fact(x-1);
    }
    
};