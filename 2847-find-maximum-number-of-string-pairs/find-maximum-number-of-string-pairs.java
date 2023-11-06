class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int max=0;
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            sb=sb.reverse();
            int cnt=0;
            for(int j=i+1;j<words.length;j++)
                if(sb.toString().equals(words[j])) cnt++;
            if(cnt>0)max++;
        }
        return max;
    }
}