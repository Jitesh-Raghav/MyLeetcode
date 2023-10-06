 class Solution{
 public String removeKdigits(String num, int k) {
        int len = num.length();
        if(k==len)
            return "0";
        // monotonic stack
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(k>0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){ 
                // whenever current element is smaller then previous element,
                // i.e remove the previous element
                // if the previous character in stk is larger than the current one
                // then removing it will get a smaller number
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        // corner case like "3333"
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        // remove trailing zeros
        while(sb.length()>0 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.length()==0?"0":sb.toString();
    }

 }

//THIS IS NOT OPTIMAL, TRY TO UNDERSTAND..
//  public String removeKdigits(String num, int k) {
        
//         StringBuilder sb = new StringBuilder();
//         for(char c : num.toCharArray()){
//             while(k > 0 && sb.length() > 0 && sb.charAt(sb.length()-1) > c){
//                 sb.deleteCharAt(sb.length()-1);
//                 k--;
//             }
//             sb.append(c);
//         }
        
//         while(k > 0){
//             sb.deleteCharAt(sb.length()-1);
//             k--;
//         }
        
//         while(sb.length() > 1 && sb.charAt(0) == '0'){
//             sb.deleteCharAt(0);
//         }
//         return sb.length() > 0 ? sb.toString() : "0";
        
//     }


//ALL TEST CASES NOT PASSED..
// class Solution {
//     public String removeKdigits(String num, int k) {
//         int max= Integer.MIN_VALUE;
//         StringBuilder sb= new StringBuilder();
//         int maxIndex=0;

//         if(num.length()==k) return "0";
//         boolean flag=true;
//         for(int i=1;i<maxIndex;i++){
//             if(num.charAt(i)!=0) flag=false;
//         }
//         if(k==1 && flag==true){
//             for(int i=maxIndex;i<num.length();i++) sb.append(num.charAt(i));
//                return sb.toString();  
//         }

//         for(int i=0;i<num.length()-k;i++){
//             if(num.charAt(i)>max){
//                 max=num.charAt(i);
//                 maxIndex=i;
//             }
//         }
        
//         for(int i=0;i<maxIndex;i++) sb.append(num.charAt(i));
//         for(int i=maxIndex+k;i<num.length();i++) sb.append(num.charAt(i));

//         return sb.toString();
//     }
// }