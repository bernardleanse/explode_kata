package com.app;
import java.util.ArrayList;

public class Solution {

  public static void main(String[] args){
    explode("123");
  }

  public static String explode(String digits){
    String[] charDigits = digits.split("");
    ArrayList<String> resultList = new ArrayList<>();

    for(int i = 0; i < charDigits.length; i++){
      for(int j = 0; j < Integer.parseInt(charDigits[i]); j++){
        resultList.add(charDigits[i]);
      }
    }

    String resultString = String.join("", resultList);
    
    return resultString;
  }
}
