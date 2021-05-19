package com.hackerrank.thirtydaysofcode.day1datatypes;

import java.util.*;

public class Solution {

  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    /* Declare second integer, double, and String variables. */
    int a;
    double b;
    String c = "";

    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
    a = scan.nextInt();
    b = scan.nextDouble();

    while(scan.hasNext()) {
      c += scan.next() + " ";
    }

    System.out.println(a + i);
    System.out.println(b + d);
    System.out.println(s + c);

    scan.close();
  }
}