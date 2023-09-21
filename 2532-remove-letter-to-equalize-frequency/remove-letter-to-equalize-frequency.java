class Solution {
    public boolean equalFrequency(String word) {
        int[] a = new int[26];
        for(int i=0; i<word.length(); i++) {
            a[word.charAt(i) - 'a']++;
        }
        
        int minFreq = word.length();
        int maxFreq = 0;
        for(int i : a) {
            if(i == 0) continue;
            minFreq = Math.min(i, minFreq);
            maxFreq = Math.max(i, maxFreq);
        }
        
        int minCount = 0;
        int maxCount = 0;
        for(int i : a) {
            if(i == 0) continue;
            if(i == minFreq) {
                minCount++;
            } else if(i == maxFreq) {
                maxCount++;
            } else {
                return false;
            }
        }
        
        if(minFreq == maxFreq) {
            return minFreq==1 || minCount == 1;
        }
        
        if(minFreq == 1) {
            return minCount == 1 || (maxFreq == 2 && maxCount == 1);
        }
        
        return maxFreq-minFreq == 1 && maxCount == 1;
    }
}