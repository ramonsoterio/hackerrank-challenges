package com.hackerrank.thirtydaysofcode.day6review;

import java.util.*;

public class Solution {

  private static boolean isNumber(String value) {
    if (value == null) {
      return false;
    }

    try {
      double d = Double.parseDouble(value);
    } catch (NumberFormatException e) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String word = "";
    String current = "";
    String even;
    String odd;

    while(s.hasNext()) {
      word = s.next();
      even = "";
      odd = "";

      for (int i = 0; i < word.length(); i++) {
        current = Character.toString(word.charAt(i));
        if (!isNumber(current)) {
          if (i % 2 == 0) {
            even += current;
          } else {
            odd += current;
          }
        }
      }
      if (even.length() > 0 || odd.length() > 0) {
        System.out.println(even + " " + odd);
      }
    }
  }
}