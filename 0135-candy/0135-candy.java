class Solution {
    public int candy(int[] ratings) {
        
        int n = ratings.length;
        int ans = 0;
        
        int [] arr = new int [n];
        Arrays.fill(arr,1);
        
        for(int i = 1; i<n; i++){
            if(ratings[i] > ratings[i-1]) arr[i] = arr[i-1] +1; 
    }
        
        for(int i = n-1; i>= 1; i--){
            if(ratings[i-1] > ratings[i]){
                if(arr[i] >= arr[i-1]) arr[i-1] = arr[i]+1;
            }
        }
        
        for(int i = 0; i<n; i++) ans+= arr[i];
        
        return ans;
    }
}