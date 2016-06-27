//https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java
package longestconsec;


public class LongestConsec {

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
    }
    
    private static String[] words;
    private static int [] wordsLen;
    private static int consecLen;
    
    
    public static String longestConsec(String[] strarr, int k) {
        if (k>strarr.length || k<=0) return "";
        words=strarr;
        consecLen=k;
        calculateWordsLength();
        return searchLongestConsec();
        
    }
    
    private static void calculateWordsLength() {
        wordsLen=new int[words.length];
        int i=0;
        for(String s:words)
            wordsLen[i++]=s.length();
    }
    
    private static String searchLongestConsec() {
        int longest=0;
        int longestIndex=0;
        for (int i=0;i<words.length-consecLen+1;i++){
          int candidateLength=calcCandidate(i);
          if (candidateLength>longest) {
              longest=candidateLength;
              longestIndex=i;
          }
        }
        StringBuilder ss=new StringBuilder();
        for(int i=longestIndex;i<longestIndex+consecLen;i++)
            ss.append(words[i]);
        return ss.toString();
    }
    
    private static int calcCandidate(int index) {
        int candidateLength=0;
        for(int i=index;i<index+consecLen;i++)
            candidateLength+=wordsLen[i];
        return candidateLength;
    }
}
