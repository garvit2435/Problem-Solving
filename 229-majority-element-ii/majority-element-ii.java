class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(count1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                count2 = 1;
            }
            else if(nums[i] == ele1){
                count1++;
            }
            else if(nums[i] == ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == ele1){
                count1++;
            }
            if(nums[i] == ele2){
                count2++;
            }
        }
        int mini = (int)(n/3 + 1);
        if(count1 >= mini) list.add(ele1);
        if(count2 >= mini) list.add(ele2);
        return list;
    }
}