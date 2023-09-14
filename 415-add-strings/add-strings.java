class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        StringBuilder sb= new StringBuilder();
        int carry=0;
        while(i>=0 && j>=0){
            int sum=Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j)) + carry;
            if(sum < 10){
                sb.append(String.valueOf(sum));
                carry=sum/10;
            }else{
                sb.append(String.valueOf(sum%10));
                carry=sum/10;
            }
            i--;j--;
        }
        while(i>=0){
            int sum=Character.getNumericValue(num1.charAt(i)) + carry;
            if(sum < 10){
                sb.append(String.valueOf(sum));
                carry=sum/10;
            }else{
                sb.append(String.valueOf(sum%10));
                carry=sum/10;
            }
            i--;
        }
        while(j>=0){
            int sum=Character.getNumericValue(num2.charAt(j)) + carry;
            if(sum < 10){
                sb.append(String.valueOf(sum));
                carry=sum/10;
            }else{
                sb.append(String.valueOf(sum%10));
                carry=sum/10;
            }
            j--;
        }
        if(carry!=0){
            sb.append(String.valueOf(carry));
        }
        return sb.reverse().toString();
    }
}