//https://www.codewars.com/kata/56cac350145912e68b0006f0/train/java

package updown;

public class Updown {
    
    private static String[] words;
    
    public static void main(String[] args) {
        System.out.println(arrange("be after arrived two My so"));
        System.out.println(arrange("who hit retaining The That a we taken"));
    }
    
    public static String arrange(String strng) {
        words=strng.split(" ");
        for (int i=0;i<words.length-1;i++)
            swapIfNeeded(i, i+1);
        StringBuilder ss=new StringBuilder();
        
        for (String s : words)
            ss.append(s).append(" ");
        return ss.toString().trim();
        
    }
    
    private static void swapIfNeeded(int index1,int index2) {
        if (index1%2==0) {
            if (words[index1].length()>words[index2].length())
                swap(index1, index2);
            words[index1]=words[index1].toLowerCase();
            words[index2]=words[index2].toUpperCase();
        }
        else {
            if (words[index2].length()>words[index1].length()) 
                swap(index1, index2);
            words[index2]=words[index2].toLowerCase();
            words[index1]=words[index1].toUpperCase();

        }
    } 
    
    private static void swap(int index1,int index2) {
        String temp=words[index1];
        words[index1]=words[index2];
        words[index2]=temp;
    }
    
}
