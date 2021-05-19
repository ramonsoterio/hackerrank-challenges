package com.hackerrank.thirtydaysofcode.day5loops;

import java.io.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    int result = 0;

    for(int i = 1; i <= 10; i++) {
      result = n * i;
      System.out.println(Integer.toString(n) + " x " + Integer.toString(i) + " = " + Integer.toString(result));
    }

    bufferedReader.close();
  }
}