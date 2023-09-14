class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        StringBuilder sb= new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0){
            int a= i>=0 ? Character.getNumericValue(num1.charAt(i)) :0;
            int b= j>=0 ? Character.getNumericValue(num2.charAt(j)): 0;
            int sum= a+b + carry;
            if(sum < 10){
                sb.append(sum);
                carry=sum/10;
            }else{
                sb.append(sum%10);
                carry=sum/10;
            }
            i--;j--;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}