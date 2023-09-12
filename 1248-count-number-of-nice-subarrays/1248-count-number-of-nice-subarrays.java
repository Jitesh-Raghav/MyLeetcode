	// int n = nums.length;
    // int count =0;
    // for(int i=0;i<n; i++){
    //     int odd = 0;
    //     for(int j=i;j<n; j++){
    //         if(nums[j]%2!=0){
    //             odd++;
    //         }
    //         if(odd==k){
    //             count++;
    //         }
    //     }
    // }
    // return count;

class Solution{
  public int numberOfSubarrays(int[] nums, int k) {
   
     int s=0,e=nums.length;
   //REPLACE ALL THE ODD DIGITS WITH 1 AND EVEN WITH 0, THEN DO ALGO OF SUBARRAY WITH SUM K..
    for(int i=0;i<e;i++){
        if(nums[i]%2!=0){
            nums[i]=1;
        }else{
            nums[i]=0;
        }
    }
      //FROM HERE CODE IS SIMILAR TO LC.560, SUBARRAY WITH SUM EQUALS K...
       Map<Integer,Integer> p = new HashMap();
        
     p.put(0,1);   
int ans=0,sum=0;
        
     for(int i=0;i<nums.length;i++){
         sum+=nums[i];
        if(p.containsKey(sum-k)){
            ans+=p.get(sum-k);
        } 
         p.put(sum,p.getOrDefault(sum,0)+1);
     }   
       return ans; 
        
    }
}