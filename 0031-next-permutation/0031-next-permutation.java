class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums, 0, n-1);
            //System.out.println(nums);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind])
            {
                swap(nums,i, ind);
                break;
            }
        }
        reverse(nums, ind+1 , n-1);
        //System.out.println(nums);

    }
    void reverse(int a[], int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}