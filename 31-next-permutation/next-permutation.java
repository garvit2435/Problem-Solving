class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i+1] > nums[i]){
                ind = i;
                break;
            }
        }
        
        if(ind == -1){
            reverse(nums, 0, n-1);
            return;
        } 
        for(int i = n-1; i >= ind; i--){
            if(nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }
        reverse(nums, ind+1, n-1);


    }
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int nums[], int a, int b){
        while(a < b){
            swap(nums, a, b);
            a++;
            b--;
        }
    }
    
}