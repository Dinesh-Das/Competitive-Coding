import java.math.BigInteger;
class Solution {
    public int arraySign(int[] nums) {
        BigInteger prod=new BigInteger("1");
        for(int val:nums) prod=prod.multiply(BigInteger.valueOf(val));
        return prod.compareTo(new BigInteger("0"));
    }
}