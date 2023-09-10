class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        boolean check[]= new boolean[nums.length];
        permutation(nums,check,ans,ds);
        return ans;
    }

    public void permutation(int arr[], boolean check[], List<List<Integer>> ans, List<Integer>ds){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(check[i]==false){
                check[i]=true;
                ds.add(arr[i]);
                permutation(arr,check,ans,ds);
                ds.remove(ds.size()-1);
                check[i]=false;
            }
        }
        

        
    }
}

