class Solution {
    public int consecutiveNumbersSum(int N) {
        int count = 0;
        for (int i = 1; (double)(N)/i > i/2.0; i++) {
            if (i % 2 == 1 && N % i == 0) count++;
            else if (i % 2 == 0 && N % i == i/2) count++;
        }
        return count;
    }
}