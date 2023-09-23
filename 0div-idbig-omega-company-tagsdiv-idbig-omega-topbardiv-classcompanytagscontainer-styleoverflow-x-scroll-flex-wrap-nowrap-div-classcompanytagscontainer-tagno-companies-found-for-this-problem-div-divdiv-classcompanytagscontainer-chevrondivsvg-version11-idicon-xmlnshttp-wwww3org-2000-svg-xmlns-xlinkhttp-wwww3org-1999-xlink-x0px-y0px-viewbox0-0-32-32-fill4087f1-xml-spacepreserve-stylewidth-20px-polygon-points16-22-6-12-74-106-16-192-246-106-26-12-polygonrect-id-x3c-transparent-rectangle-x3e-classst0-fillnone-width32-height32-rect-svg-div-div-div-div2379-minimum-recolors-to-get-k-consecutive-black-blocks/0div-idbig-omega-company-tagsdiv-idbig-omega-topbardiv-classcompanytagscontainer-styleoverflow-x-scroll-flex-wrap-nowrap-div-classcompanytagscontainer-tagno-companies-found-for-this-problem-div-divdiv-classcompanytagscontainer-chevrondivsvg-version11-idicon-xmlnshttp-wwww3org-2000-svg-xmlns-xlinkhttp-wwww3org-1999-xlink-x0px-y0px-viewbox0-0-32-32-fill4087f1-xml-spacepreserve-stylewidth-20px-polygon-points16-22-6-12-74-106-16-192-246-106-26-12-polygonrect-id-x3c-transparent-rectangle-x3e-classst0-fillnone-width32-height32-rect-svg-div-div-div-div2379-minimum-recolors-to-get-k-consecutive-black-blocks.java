//TO FIND THE MIN OPERATIONS TO TURN WHITE IN BLACK, JUST FIND WINDOW WHICH HAS LEAST NUMBER OF WHITES(W)
//CUZ JITNE KAM WHITES IN WINDOW UTNE KAM OPERATIONS..

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0,j=0,count=0;

        int n=blocks.length();
        int min=Integer.MAX_VALUE;
        char c[]=blocks.toCharArray();

        while(j<n){
           if(c[j]=='W') count++;
             
              if(j-i+1==k){
              min=Math.min(min,count);
                if(c[i]=='W'){
                    count--;
                }
                i++;


            }
                j++;
         }
      return min;
    }
}