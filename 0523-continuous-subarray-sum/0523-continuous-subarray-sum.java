// class Solution{
//     public boolean checkSubarraySum(int[] nums, int k) {
	
// 	for (int i = 0; i < nums.length - 1; i++) {
// 		int sum = nums[i];

// 		for (int j = i + 1; j < nums.length; j++) {
// 			sum += nums[j];

// 			if (sum % k == 0) return true;
// 		}
// 	}	

// 	return false;
// }
// }

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0,0);
        
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            
            sum += nums[i];
            
            if(!map.containsKey(sum % k)){
                map.put(sum % k, i + 1);
            }else{
                if(map.get(sum % k) < i){
                    return true;
                }
            }
            
        }
        
        return false;
        
    }
}

