class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
        int totalGas = 0, totalCost = 0;
       for(int i = 0 ; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;
        
        int remainsGas = 0, start = 0;
        for(int i = 0 ; i < gas.length; i++){
           remainsGas = remainsGas +(gas[i] - cost[i]);
            // If remainsGas becomes negative, set start to the next station and reset remainsGas to 0
            if(remainsGas < 0 ){
                start = i+1;
                remainsGas = 0;
            }
        }
        
        return start;
    }
}




// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
        
//         int distance=0;
//         int startPoint=0;
//        for(int i=0;i<gas.length;i++){
//            if(gas[i]>cost[i]) startPoint =1;
//        }
//        int j= startPoint;
//        while(true){
//            int nextIndex= (j+1)%gas.length;
//            distance = gas[j] + gas[nextIndex] - cost[j];
//            j=nextIndex;
           

//            if(distance==0 && j==startPoint) return startPoint;
//        }
//        return -1;
//     }
// }