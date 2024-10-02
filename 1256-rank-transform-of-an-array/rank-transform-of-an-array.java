class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] dum = new int[arr.length];
        for(int i=0;i<arr.length;i++)dum[i]=arr[i];
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val: arr)
        {
            System.out.println(val);
            if(!map.containsKey(val))
            {
                map.put(val,map.size()+1);
            }
        }   
        int[] ar= new int [arr.length];
        int cnt=0;
       for(int val:dum)
        {
            ar[cnt]=map.get(val);
            cnt++;
            
        }
        return ar;
    }
}