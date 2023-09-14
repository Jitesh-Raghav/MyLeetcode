class Solution {

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] decrypted = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i+j) % n];
                }
            } else if (k < 0) {
                for (int j = -1; j >= k; j--) {
                    sum += code[((i+j) % n + n) % n];
                }
            }
            decrypted[i] = sum;
        }
        
        return decrypted;
    }
}