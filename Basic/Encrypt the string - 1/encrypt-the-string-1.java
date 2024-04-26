//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.encryptString(s));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
  String encryptString(String s) 
  {
    if(s.isEmpty()) {
      return s;
    }
    
    StringBuilder sb = new StringBuilder();
    
    int count = 1;
    int n = s.length();
    for(int i = 0; i < n; i++){
      
      if(i == n - 1){
        sb.append(s.charAt(i));
        sb.append(count);
      }
      else if(s.charAt(i)!= s.charAt(i + 1)) {
        sb.append(s.charAt(i));
        sb.append(count);
        count = 1;
      }
      else{
        count++;
      }
    }
    
    return sb.reverse().toString();
  }
}


/*
 Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        boolean flag = true;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(flag && map.containsKey(c))
                flag = true;
                map.put(c, map.get(c) + 1);
            else{
                map.put(c, 1);
                flag = false;
            }
            
        }
        for(Map.Entry me: map.entrySet()){
            sb.append((char)me.getKey());
            sb.append((int)me.getValue());
        }
*/