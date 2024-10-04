class Solution {
    public long dividePlayers(int[] skill) {
        long res=0;
        Arrays.sort(skill);
        int i=0,j=skill.length-1;
        int total=skill[i]+skill[j];
        while(i<j){
            if(skill[i]+skill[j] != total) return -1;
            res+= (long)(skill[i]*skill[j]);
            i++;
            j--;
        }
        return res;
    }
}