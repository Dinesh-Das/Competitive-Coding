class Solution {
    public int numSpecial(int[][] mat) {
        int special=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0) continue;
                boolean good=true;
                for (int r = 0; r < mat.length; r++) {
                    if (r != i && mat[r][j] == 1) {
                        good = false;
                        break;
                    }
                }
                for (int c = 0; c < mat[0].length; c++) {
                    if (c != j && mat[i][c] == 1) {
                        good = false;
                        break;
                    }
                }
                
                if (good) {
                    special++;
                }
            }
        }
        return special;
    }

}