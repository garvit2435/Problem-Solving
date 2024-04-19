class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    swap(nums, j, j+1);
                    flag = true;
                }
            }
            if(flag == false) break;
        }
    }

    public void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}