class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<= i;j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    list.add(pascal.get(i-1).get(j) + pascal.get(i-1).get(j-1));
                }
            }
            pascal.add(list);
        }
        return pascal.get(rowIndex);
    }
}