class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums[0] < nums[nums.length-1]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i-1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i-1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

//SINGLE PASS SOLUTION
/*  
   public boolean isMonotonic(int[] A) {
     boolean increasing = false, decreasing = false;
     for(int i = 1; i< A.length; i++){
         if(A[i] < A[i-1]) decreasing = true;
         if(A[i] > A[i-1]) increasing = true;
     }
     return increasing && decreasing ? false: true;
    }
    */