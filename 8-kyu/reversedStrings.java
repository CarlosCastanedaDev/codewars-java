// Complete the solution so that it reverses the string passed into it.

// 'world'  =>  'dlrow'
// 'word'   =>  'drow'

public class reversedStrings {
    public static String solution(String str) {
      char[] reverse = new char[str.length()];
      for (int i = 0; i < str.length(); i++) {
        reverse[i] = str.charAt(str.length() - 1 - i); 
      }
      return new String(reverse); 
    }
  }