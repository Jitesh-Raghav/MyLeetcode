// public class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int i = 0, j = nums.length - 1;
        
//         while (i < j) {
//             while (i < j && nums[i] % 2 == 0) i++;
                
//             while (i < j && nums[j] % 2 == 1)  j--;
               
            
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//         }
        
//         return nums;
//     }
// }

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++){
                if(nums[i]%2==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            

        }
        return nums;
    }
}