class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int r=0,l=0,cnt=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    r+=mat[i][j];
                }
                if(j==cnt){
                    l+=mat[i][j];
                    cnt--;
                }
            }
        }
        if(mat.length%2!=0)
            sum+=r+l-mat[mat.length/2][mat[0].length/2];
        else
            sum+=r+l;
        return sum;
    }
}

