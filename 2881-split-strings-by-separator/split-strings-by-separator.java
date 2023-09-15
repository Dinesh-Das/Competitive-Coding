class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new ArrayList<>();
        for(String word:words){
            String[] strs=word.split("\\"+separator);
            List<String> dummy=Arrays.asList(strs);
            for(int i=0;i<dummy.size();i++){
                if(dummy.get(i).length()!=0){
                    list.add(dummy.get(i));   
                }
            }
        }
        return list;
    }
}