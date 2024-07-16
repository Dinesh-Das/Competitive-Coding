class Solution {
    public int maximumSwap(int num) {
        char[] no = String.valueOf(num).toCharArray();
        char max='0';
        int idx=-1;
        for(int i=0;i<no.length;i++){
            for(int j=i+1;j<no.length;j++){
                if(no[j] > no[i] && no[j] >= max ){
                    max=no[j];
                    idx=j;
                }
            }
            if(no[i] < max){
                no[idx]=no[i];
                no[i]=max;
                break;
            }

        }
        return Integer.parseInt(String.valueOf(no));
    }
}