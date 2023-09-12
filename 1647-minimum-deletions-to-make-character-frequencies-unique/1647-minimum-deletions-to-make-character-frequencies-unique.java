class Solution{
        public int minDeletions(String s) {
        int[] freq = new int[26];
        
        for(char c: s.toCharArray())  freq[c - 'a']++;
    
        int deletions = 0;
        HashSet<Integer> freqSet = new HashSet<>();
        for (int i = 0; i < freq.length; i++) {
            // subtract till it's unique
            while(freq[i] != 0 && freqSet.contains(freq[i])) {
                freq[i]--;
                deletions++;
            }
            freqSet.add(freq[i]);
        }
        
        return deletions;
    }
}