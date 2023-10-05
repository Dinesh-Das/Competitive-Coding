class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> zeroIdx=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zeroIdx.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        for(List<Integer> idx:zeroIdx){
            System.out.println(idx);
            int x=idx.get(0),y=idx.get(1);
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if(i==x || j==y){
                        matrix[i][j]=0;
                    }
                }
            }

        }
    }
}