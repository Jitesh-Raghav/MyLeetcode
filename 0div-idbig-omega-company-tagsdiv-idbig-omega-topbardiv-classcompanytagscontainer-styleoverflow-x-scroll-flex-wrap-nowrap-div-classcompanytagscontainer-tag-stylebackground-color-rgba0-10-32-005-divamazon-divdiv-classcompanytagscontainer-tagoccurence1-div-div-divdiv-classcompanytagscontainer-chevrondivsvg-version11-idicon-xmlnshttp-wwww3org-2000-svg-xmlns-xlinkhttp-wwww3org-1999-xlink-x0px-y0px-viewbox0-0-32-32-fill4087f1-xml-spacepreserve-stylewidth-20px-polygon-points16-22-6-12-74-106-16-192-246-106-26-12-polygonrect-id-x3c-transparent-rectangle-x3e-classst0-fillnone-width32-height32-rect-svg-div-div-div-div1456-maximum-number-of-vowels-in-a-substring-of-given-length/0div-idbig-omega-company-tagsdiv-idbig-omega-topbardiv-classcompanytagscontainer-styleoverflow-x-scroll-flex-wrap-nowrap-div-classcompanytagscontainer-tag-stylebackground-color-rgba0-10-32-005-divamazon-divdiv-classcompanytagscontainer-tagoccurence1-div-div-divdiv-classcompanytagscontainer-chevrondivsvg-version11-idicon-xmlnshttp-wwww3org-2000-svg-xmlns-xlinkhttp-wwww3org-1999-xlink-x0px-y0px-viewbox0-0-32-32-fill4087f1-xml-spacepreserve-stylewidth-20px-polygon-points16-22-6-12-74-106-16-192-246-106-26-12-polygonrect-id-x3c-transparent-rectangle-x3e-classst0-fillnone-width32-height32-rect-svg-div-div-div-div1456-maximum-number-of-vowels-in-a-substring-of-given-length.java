class Solution {
    public boolean isVowel(char c) {
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }

    public int maxVowels(String s, int k) {
        int i = 0, j = 0, countVowels = 0, maxVowel = 0, n = s.length();

        while (j < n) {
            if (isVowel(s.charAt(j)))
                countVowels++;

            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                maxVowel = Math.max(maxVowel, countVowels);

                if (isVowel(s.charAt(i)))
                    countVowels--;
                i++;
                j++;
            }
        }
        return maxVowel;
    }
}