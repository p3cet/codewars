//https://www.codewars.com/kata/number-of-trailing-zeros-of-n/train/java
package trailingzeros;

public class TrailingZeros {

    public static void main(String[] args) {
        System.out.println(zeros(30));
    }
    
    public static int zeros(int n) {
        if (n<5) return 0;
        int numberOfZeros=0;
        int factor=5;
        do {
            numberOfZeros+=n/factor;
        } while (n/(factor*=5)>=1);
        return numberOfZeros;
        
    }
    
}
