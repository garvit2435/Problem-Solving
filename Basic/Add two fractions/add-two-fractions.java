//{ Driver Code Starts
import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this function*/
class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here
        int numx = num1 * den2 + den1 * num2;
        int denx = den1 * den2;
        for(int i = 2; i < Math.sqrt(denx); i++){
            while(numx % i == 0 && denx % i == 0){
                numx /= i;
                denx /= i;
            }
        }
        System.out.println(numx + "/" + denx);
    }
}