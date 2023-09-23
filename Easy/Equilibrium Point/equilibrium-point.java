//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        // if(n==1) return 1;
        // if(n==2) return -1;
        
        // long sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        // }
        // long temp=0;
        // int j=0;
        // int add=sum;
        // while(temp!=add/2){
        //     if(temp+arr[j]==(sum-arr[j])/2)
        //     temp=temp+arr[j];
        //     j++;
        // }
        // return j-1;
        
        int leftsum=0;
        int rightsum=0;
        
        for(int i=0; i<n; i++){
            leftsum+=arr[i];
        }
        
        for(int i=n-1; i>=0; i--){
            rightsum+=arr[i];
            
            if(leftsum==rightsum){
                return (i+1);
            }
            leftsum-=arr[i];
        }
        return -1;
        
    }
};
