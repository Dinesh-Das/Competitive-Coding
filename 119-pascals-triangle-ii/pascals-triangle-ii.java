class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    list.add(1);
                else
                    list.add(prev.get(j) + prev.get(j-1));
            }
            prev=list;
        }
        return prev;
    }
}