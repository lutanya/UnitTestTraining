package by.epam.test.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CommonUtils {
  
  private static final String SPACE = " ";
  private static final String REPLACE_STRING = "\\s+";

  public static String toCapitalize(String pString) {
    StringBuilder capStr  = new StringBuilder();
    if (pString != null && pString.length() != 0) {
      String inputStr = pString.trim().replaceAll(REPLACE_STRING, SPACE);
      capStr.append(inputStr);
      char space = ' ';
      for(int i=0, lastSpaceIdx = i-1; i<capStr.length(); i++){
        char letter = capStr.charAt(i);
        if(letter == space) lastSpaceIdx = i;
        else if(i-1 == lastSpaceIdx) capStr.setCharAt(i, Character.toUpperCase(letter));
        else capStr.setCharAt(i, Character.toLowerCase(letter));
      }
    }
    return capStr.toString();
  }
  
  
  public static List<String> getArrayListFromString(String pStrGiven, String pSeparator) {
    List<String> convertedList = new ArrayList<String>();
    StringTokenizer st;
    if (pStrGiven != null && pSeparator != null) {
      st = new StringTokenizer(pStrGiven, pSeparator);
      while (st.hasMoreTokens()) {
        convertedList.add(st.nextToken());
      }
    }
    return convertedList;
  }

}
