class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left=0,top=0,right=matrix[0].length,bottom=matrix.length;
        while(left < right && top < bottom){
            for(int i=top;i<right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<bottom;i++){
                list.add(matrix[i][right-1]);
            }
            right--;
            
            if(!(left < right && top < bottom)) break;

            for(int i=right-1;i>=left;i--){
                list.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i=bottom-1;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;

        }
        return list;
    }
}