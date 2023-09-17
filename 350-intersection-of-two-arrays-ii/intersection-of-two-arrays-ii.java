class Solution {

    public int binarySearch(List<Integer>nums,int target){
        int s=0;
        int e=nums.size()-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums.get(m) == target) return m;
            if(nums.get(m) > target) e=m-1;
            else s=m+1;
        }
        return -1;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        List<Integer> list=new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int val:nums1) a.add(val);
        for(int val:nums2) b.add(val);
        if(n>=m){
            for(int val : b){
                int temp=binarySearch(a,val);
                if(temp!=-1){
                    a.remove(temp);
                    list.add(val);
                }
            }
        }else{
            for(int val : a){
                int temp=binarySearch(b,val);
                if(temp!=-1){
                    list.add(val);
                    b.remove(temp);
                } 
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++) res[i]=list.get(i);
        return res;
    }
}