class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        int carry=0;
        int i=a.length()-1,j=b.length()-1;
        while(i>=0 || j>=0 || carry!=0){
            int x= i>=0? Character.getNumericValue(a.charAt(i)) : 0;
            int y= j>=0? Character.getNumericValue(b.charAt(j)) : 0;
            if(x==0 && y==0 && carry==0){
                sb.append(0);
            }else if(x==0 && y==0 && carry==1){
                sb.append(1);
                carry=0;
            }else if(x==1 && y==1 && carry==0){
                sb.append(0);
                carry=1;
            }else if(x==1 && y==1 && carry==1){
                sb.append(1);
                carry=1;
            }else if(x==0 && y==1 && carry==0){
                sb.append(1);
            }else if(x==1 && y==0 && carry==0){
                sb.append(1);
            }else if(x==0 && y==1 && carry==1){
                sb.append(0);
                carry=1;
            }else if(x==1 && y==0 && carry==1){
                sb.append(0);
                carry=1;
            }
            i--;
            j--;
        }
        if(carry==1)sb.append(1);
        return sb.reverse().toString();
    }
}