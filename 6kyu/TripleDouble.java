//https://www.codewars.com/kata/55d5434f269c0c3f1b000058/train/java
package tripledouble;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class TripleDouble {

    public static void main(String[] args) {
        System.out.println(TripleDouble(111456, 1122));
    }
    
    public static int TripleDouble(long num1, long num2){
        populateTrips();
        System.out.println(Arrays.toString(trips));
        String num1String=Long.toString(num1);
        String num2String=Long.toString(num2);
        searchTrips(num1String);
        if (foundTrips.size()>0)
            return searchPairs(num2String);
        return 0;
    }
    
    private static String[] trips;
    private static List<String> foundTrips;
    
    private static void populateTrips() {
        trips=new String[10];
        trips[0]="000";
        for (int i=1;i<=9;i++)
            trips[i]=Integer.toString(i*111);
    }
    
    private static void searchTrips(String num) {
        foundTrips=new LinkedList<>();
        for (String s: trips)
            if(num.contains(s)) foundTrips.add(s);
    }
    
    private static int searchPairs(String num){
        for (String s: foundTrips)
            if (num.contains(s.substring(1))) return 1;
        return 0;
    }
    
}
