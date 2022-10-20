//Given two strings, determine the length of the longest common substring which is common in both strings.

public class LongestCommonSubstring{
  public static void main(String[] args){
    String firstString = "JavaProgrammingLanguage";
    String secondString = "JavaLanguage";
    int lenFirstString = firstString.length();
    int lenSecondString = secondString.length();
    int length = longestCommonSubstring(firstString.toCharArray(), secondString.toCharArray(), lenFirstString, lenSecondString, 0);
    System.out.println("Length of longest common substring: " + length);
  }
  
  public static int longestCommonSubstring(char[] firstString, char[] secondString, int lenFirstString, int lenSecondString, int count){
    if(lenFirstString <= 0 || lenSecondString <= 0) 
      return count;
    
    int lcsCount = count;
    if(firstString[lenFirstString - 1] == secondString[lenSecondString - 1]){
      lcsCount = longestCommonSubstring(firstString, secondString, lenFirstString - 1, lenSecondString - 1, count + 1);
    }
    int lcsCount1 = longestCommonSubstring(firstString, secondString, lenFirstString, lenSecondString - 1, 0);
    int lcsCount2 = longestCommonSubstring(firstString, secondString, lenFirstString - 1, lenSecondString, 0);
    return Math.max(lcsCount, Math.max(lcsCount1,lcsCount2));
  }
}
