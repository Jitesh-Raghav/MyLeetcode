class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] isCovered = new boolean[1001]; 
        
        for (List<Integer> num : nums) {
            int start = num.get(0);
            int end = num.get(1);
            for (int i = start; i <= end; i++) {
                isCovered[i] = true;
            }
        }
        
        int count = 0;
        for (boolean x : isCovered) {
            if (x) {
                count++;
            }
        }
        
        return count;
    }
}
