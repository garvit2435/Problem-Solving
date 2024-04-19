//My solution
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
// //Dutch national flag algo:
// class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0, mid = 0, high = nums.length - 1;
//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 swap(nums, low, mid);
//                 low++;
//                 mid++;
//             } else if (nums[mid] == 1) {
//                 mid++;
//             } else {
//                 swap(nums, mid, high);
//                 high--;
//             }
//         }
//     }
    
//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }


//Bubble sort
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