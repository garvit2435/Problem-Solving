//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
    //   int count = 0;
    //   int ind = 0;
        int s_len = s.length();
        int x_len = x.length();
       for(int i = 0; i <= s_len - x_len; i++){
           int j = 0;
           for(j = 0; j < x_len; j++){
               if(x.charAt(j) != s.charAt(i + j)){
                   break;
               }
           }
            if(j == x_len) return i;
       }
      // if(count == x.length()) return ind;
       return -1;
    }
}
