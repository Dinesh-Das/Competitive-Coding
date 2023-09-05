class Solution {
    public int[] plusOne(int[] digits) {
        int carry=-1;
        List<Integer> list=new ArrayList<>();
        for(int i=digits.length-1;i>=0;i--){
            int digit=digits[i];
            if(carry==-1){
                digit++;
            }
            if(carry==1){
                digit++;
                carry=0;
            }
            if(digit>=10){
                carry=1;
                list.add(digit%10);
            }else{
                list.add(digit);
                carry=0;
            }
        }
        if(carry==1){
            list.add(carry);
        }
        int n=list.size();
        int[] res=new int[n--];
        for(int val:list){
            res[n--]=val;
        }
        return res;
        
    }
}