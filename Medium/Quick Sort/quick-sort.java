//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


// class Solution
// {
//     //Function to sort an array using quick sort algorithm.
//     static void quickSort(int arr[], int low, int high)
//     {
//         // code here
//     }
//     static int partition(int arr[], int low, int high)
//     {
//         // your code here
//     } 
// }
class Solution{
    //using quicksort
    public static int[] sortArray(int[] nums){
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
    static void quickSort(int nums[], int low, int high){
        if(low<high){
            
            int pivIndex=findIndex(nums, low, high);
            quickSort(nums, low, pivIndex-1);
            quickSort(nums, pivIndex+1, high);

        }
        //else return;
    }
    static int findIndex(int nums[], int low, int high){
        int i=low;
        int j=high;
        int pivot=nums[low];
        while(i<j){
            while(nums[i]<=pivot && i<=high-1) {
                i++;
            }    
            while(nums[j]>pivot && j>=low+1){
                j--;
            } 
            if(i<j) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int var=nums[low];
        nums[low]=nums[j];
        nums[j]=var;
      
        return j;
    }
}
