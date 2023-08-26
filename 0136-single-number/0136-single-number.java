class Solution {
    public int singleNumber(int[] nums) {
        int temp=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            temp=temp^nums[i];
        }
        return temp;
    }
}