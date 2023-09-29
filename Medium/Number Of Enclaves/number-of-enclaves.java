//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}

class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        Queue<Pair> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1|| j==0|| j==m-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                    
                }
            }
        }
        
        int delRow[] ={-1, 0, +1, 0};
        int delCol[] ={0, +1, 0,-1};
        
        while(!q.isEmpty()){
            int x=q.peek().first;
            int y=q.peek().second;
            q.remove();
            
            for(int i=0;i<4;i++){
                int row=x+delRow[i];
                int col=y+delCol[i];
                
                if(row>=0 && row<n && col>=0 && col<m && grid[row][col]==1 && vis[row][col]==0){
                    q.add(new Pair(row,col));
                    vis[row][col]=1;
                }
            }
        }
            int count=0;
             for(int i=0;i<n;i++){
                 for(int j=0;j<m;j++){
                     if(grid[i][j]==1 && vis[i][j]==0){
                         count++;
                     }
                 }
             }
        return count;
        
    }
}