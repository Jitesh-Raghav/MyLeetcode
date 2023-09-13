// class Solution {
//     public int maxAbsoluteSum(int[] nums) {
//         int max=Integer.MIN_VALUE;
//         int abs=0;
//         for(int i=0;i<nums.length;i++){
//              int sum=0;
//             for(int j=i;j<nums.length;j++){
//                sum+=nums[j];
                
//                 abs=Math.abs(sum);
//                 if(abs>max) max=abs;
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min=0;
        int max=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=nums[i];
            if(max<c) max=c;
            if(c<0) c=0;
        }
        c=0;
        for(int i=0;i<nums.length;i++){
            c+=nums[i];
            if(min>c) min=c;
            if(c>0) c=0;
        }return Math.max(Math.abs(max),Math.abs(min));
    }
}