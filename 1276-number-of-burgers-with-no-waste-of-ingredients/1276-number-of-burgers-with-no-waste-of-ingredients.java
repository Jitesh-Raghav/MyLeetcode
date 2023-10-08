class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        // Jumbo Burger: 4 tomato slices and 1 cheese slice.
        // Small Burger: 2 Tomato slices and 1 cheese slice.

        // 4 * x + 2 * y = tomatoSlices
        // 2*x + 2*y = 2* cheeseSlices

        int jumbo = (tomatoSlices - 2 * cheeseSlices) / 2 ;
        int small = cheeseSlices - jumbo ;

        if(jumbo >=0 && 
           small>=0 &&
             4 * jumbo + 2* small == tomatoSlices
             && jumbo + small == cheeseSlices ){
           return List.of(jumbo, small);

        }
        return new ArrayList();

        
    }
}