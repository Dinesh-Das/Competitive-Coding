class Solution {
    public int findSpecialInteger(int[] arr) {
        double rate=arr.length * 0.25;
        int cnt=0,num=0;
        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                cnt++;
                j++;
            }else{
                if(cnt > rate){
                    return arr[i];
                }
                cnt=0;
                i=j;
            }
        }
        if(cnt!=0){
            num=arr[i];
        }
        return num;
    }
}