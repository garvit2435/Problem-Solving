//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 

{ 
    
    String sort(String s) 
    {
        // code here
        int N = 26;
        int letter[] = new int[N];
        String str = "";
        
        for(char x: s.toCharArray()){
            letter[x - 'a']++;
        }
        
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < letter[i]; j++){
                str = str + Character.toString(i + 'a');
            }
        }
        
        return str;
        
    }
} 