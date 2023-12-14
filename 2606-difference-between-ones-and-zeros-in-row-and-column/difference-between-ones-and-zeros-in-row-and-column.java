class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] oneRow=new int[grid.length];
        int[] oneCol=new int[grid[0].length];
        int res[][] = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                oneRow[i]+=grid[i][j];
                oneCol[j]+=grid[i][j];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                res[i][j]= oneRow[i]+oneCol[j] - (grid.length - oneRow[i]) - (grid[i].length-oneCol[j]);
            }
        }
        return res;
    }
}