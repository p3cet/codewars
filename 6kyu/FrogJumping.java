//https://www.codewars.com/kata/frog-jumping/train/java

package frogjumping;

import java.util.Set;
import java.util.HashSet;

public class FrogJumping {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int solution(int[] a) {
        if (a.length==0 || a==null) return -1;
        Set<Integer> indices=new HashSet<>();
        int currentIndex=0;
        indices.add(currentIndex);
        int steps=0;
        while (currentIndex>=0 && currentIndex<a.length) {
            if(a[currentIndex]==0) return -1;
            currentIndex+=a[currentIndex];
            if (indices.contains(currentIndex)) return -1;
            indices.add(currentIndex);
            steps++;
            
        }
        return steps;
    }
}
