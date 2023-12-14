class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] diff= new int[n][m];
        int[] Onerow= new int[n];
        int[] Zerorow= new int[n];
        int[] Onecol=new int[m];
        int[] Zerocol=new int[m];
        int zero=0,one=0;
        for(int i=0;i<n;i++){
            int z=0,o=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    o++;
                }else{
                    z++;
                }
            }
            Onerow[i]=o;
            Zerorow[i]=z;
        }
        for(int i=0;i<m;i++){
            int o=0,z=0;
            for(int j=0;j<n;j++){
                if(j < n && grid[j][i]==1) o++;
                else if(j<n && grid[j][i]==0)z++;
            }
            Onecol[i]=o;
            Zerocol[i]=z;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diff[i][j]=Onerow[i]+Onecol[j] - Zerorow[i]-Zerocol[j];
            }
        }
        return diff;
    }
}