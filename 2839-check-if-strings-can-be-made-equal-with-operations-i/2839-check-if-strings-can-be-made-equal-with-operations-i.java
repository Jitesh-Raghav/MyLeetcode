class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i) && s1.charAt(i) != s2.charAt((i + 2) % s1.length())) 
            return false;
        }
        return true;
    }
}

//SEE BELOW SOLUTION ALSO...
// class Solution {
//     public boolean canBeEqual(String s1, String s2) {
//         char[] ch = s1.toCharArray();
//         if(s1.equals(s2)) {
//             return true;
//         }
//         for(int i=0; i<2; i++) {
//             if(ch[i]==s2.charAt(i+2)) {
//                 char ct = ch[i];
//                 ch[i] = ch[i+2];
//                 ch[i+2] = ct;
//             }
//             if(String.valueOf(ch).equals(s2)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }