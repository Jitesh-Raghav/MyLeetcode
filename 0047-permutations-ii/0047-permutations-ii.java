public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ds = new ArrayList<Integer>();
        boolean[] check = new boolean[nums.length];
        if(nums==null || nums.length==0) return ans;
        
        Arrays.sort(nums);
        dfs(nums, check, ds, ans);
        return ans;
    }

    public void dfs(int[] nums, boolean[] check, List<Integer> ds, List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(check[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !check[i-1]) continue;
            check[i]=true;
            ds.add(nums[i]);
            dfs(nums,check,ds,ans);
            check[i]=false;
            ds.remove(ds.size()-1);
        }
    }
}