class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero=0, one=0, two=0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) zero++;
            if(nums[i] == 1) one++;
            if(nums[i] == 2) two++;
        }
        for(int i = 0; i < zero; i++){
            nums[i] = 0;
        }
        for(int i = 0; i < one; i++){
            nums[zero + i] = 1;
        }
        for(int i = 0; i < two; i++){
            nums[zero + one + i] = 2;
        }
    }

    
}

// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             boolean flag = false;
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (nums[j + 1] < nums[j]) {
//                     swap(nums, j, j+1);
//                     flag = true;
//                 }
//             }
//             if(flag == false) break;
//         }
//     }

//     public void swap(int nums[], int i, int j){
//         int temp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//     }
// }