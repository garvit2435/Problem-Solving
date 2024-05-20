class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int res = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                res = nums[i];
            }
            if(nums[i] == res) count++;
            else count--;
        }
        return res;
    }
}
