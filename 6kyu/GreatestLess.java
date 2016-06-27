//https://www.codewars.com/kata/when-greatest-is-less-than-smallest
package greatestless;

import java.math.BigInteger;

public class GreatestLess {

    public static void main(String[] args) {
        BigInteger x=new BigInteger("1000000007");
        BigInteger y=new BigInteger("1000000009");
        BigInteger n=new BigInteger("10000000000000000000");
        
        System.out.println(greatest(x, y, n));
        System.out.println(smallest(x, y, n));
        
    }
    
    public static BigInteger greatest(BigInteger x, BigInteger y, BigInteger n){
        BigInteger LCM=findLowestCommonMultiple(x, y);
        if (LCM.compareTo(n)>=0) return new BigInteger("0");
        BigInteger div=n.divide(LCM);
        return LCM.multiply(div);
    }
    public static BigInteger smallest(BigInteger x, BigInteger y, BigInteger n){
        BigInteger LCM=findLowestCommonMultiple(x, y);
        if (LCM.compareTo(n)==1) return LCM;
        BigInteger div=n.divide(LCM);
        div=div.add(BigInteger.ONE);
        return LCM.multiply(div);
    }
    
    private static BigInteger findLowestCommonMultiple(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(findGreatestCommonDivisor(x, y));
    }
    
    private static BigInteger findGreatestCommonDivisor(BigInteger x, BigInteger y) {
        do {
            BigInteger temp=x.min(y);
            y=x.max(y).mod(x.min(y));
            x=temp;
        }
        while(y.compareTo(BigInteger.ZERO)!=0);
        return x;
    }
    
    
}
