class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> loc= new HashMap<>();
        for(List<String> list:paths){
            loc.put(list.get(0),list.get(1));
        }
        String res=paths.get(0).get(0);
        while(loc.containsKey(res)){
            res=loc.get(res);
        }
        return res;
    }
}