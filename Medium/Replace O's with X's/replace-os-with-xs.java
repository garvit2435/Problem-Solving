//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static char[][] fill(int n, int m, char a[][]) {
        if (a == null || n == 0 || m == 0) {
            return a;
        }

        // Traverse the border of the matrix and mark connected 'O' cells with 'Y'
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 'O') {
                dfs(a, i, 0);
            }
            if (a[i][m - 1] == 'O') {
                dfs(a, i, m - 1);
            }
        }
        for (int j = 0; j < m; j++) {
            if (a[0][j] == 'O') {
                dfs(a, 0, j);
            }
            if (a[n - 1][j] == 'O') {
                dfs(a, n - 1, j);
            }
        }

        // Traverse the entire matrix and mark remaining 'O' cells as 'X', and revert 'Y' cells back to 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'O') {
                    a[i][j] = 'X';
                } else if (a[i][j] == 'Y') {
                    a[i][j] = 'O';
                }
            }
        }

        return a;
    }

    private static void dfs(char[][] board, int row, int col) {
        int n = board.length;
        int m = board[0].length;

        if (row < 0 || row >= n || col < 0 || col >= m || board[row][col] != 'O') {
            return;
        }

        // Mark the current 'O' cell as 'Y'
        board[row][col] = 'Y';

        // Recursively traverse adjacent cells
        dfs(board, row - 1, col);
        dfs(board, row + 1, col);
        dfs(board, row, col - 1);
        dfs(board, row, col + 1);
    }
}
