class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() < 3) return 0;
            
        int i = 0, count = 0, j = 0, n = s.length();
        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (j - i + 1 < 3)  j++;
               
            else if (j - i + 1 == 3) {
                if (map.size() == 3)  count++;
                   
                j++;
                
                int charCount = map.get(s.charAt(i)) - 1;
                if (charCount == 0)
                    map.remove(s.charAt(i));
                else
                    map.put(s.charAt(i), charCount);
                i++;
            }
        }
        return count;
    }
}
