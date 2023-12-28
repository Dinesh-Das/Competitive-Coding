class Solution {
    public boolean isPathCrossing(String path) {
        Map<Character,Pair<Integer,Integer>> map = new HashMap<>();
        map.put('N',new Pair(0,1));
        map.put('E',new Pair(1,0));
        map.put('S',new Pair(0,-1));
        map.put('W',new Pair(-1,0));

        Set<Pair<Integer,Integer>> visited=new HashSet<>();
        visited.add(new Pair(0,0));
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            Pair<Integer,Integer> pair= map.get(path.charAt(i));
            int dx=pair.getKey();
            int dy=pair.getValue();
            x+=dx;
            y+=dy;
            Pair<Integer,Integer> npair= new Pair(x,y);
            if(visited.contains(npair)){
                return true;
            }
            visited.add(npair);
        }
        return false;
    }
}