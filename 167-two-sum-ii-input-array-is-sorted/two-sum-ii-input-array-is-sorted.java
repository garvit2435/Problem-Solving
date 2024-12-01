class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while(low < high){
            if(nums[low] + nums[high] == t){
                return new int[]{low + 1, high + 1};
            }
            else if(nums[low] + nums[high] > t){
                high--;
            }
            else if(nums[low] + nums[high] < t){
                low++;
            }
        }
        return new int[]{low + 1, high + 1};
        
    }
}