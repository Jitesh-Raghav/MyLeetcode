// class Solution {
//     public char findTheDifference(String s, String t) {
//         int sum1=0,sum2=0;
//         for(int i=0; i<s.length(); i++){
//             sum1 = sum1 + s.charAt(i);
//         }
//         for(int i=0; i<t.length(); i++){
//             sum2 = sum2 + t.charAt(i);
//         }
//        return (char) (sum2-sum1);
//     }
// }

class Solution {
    public char findTheDifference(String s, String t) {
        char charXOR = 0;
        for(char ch : s.toCharArray()) charXOR ^= ch;
        for(char ch : t.toCharArray()) charXOR ^= ch;
        return charXOR;
    }
}


// class Solution {
//     public char findTheDifference(String s, String t) {
//         StringBuilder sb= new StringBuilder();
//         for(int i=0,j=0;i<s.length() && j<t.length(); i++,j++){
//             if(s.charAt(i)!=t.charAt(j))
//             sb.append(t.charAt(j));
//         }
//         return sb;
//     }
// }