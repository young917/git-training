package com.mycompany.test;

public class Calculator {

  public static void main(String[] args) {
    int a = 4;
    int b = 2;
    System.out.println( sum(a,b) );
    System.out.println( minus(a,b) );

    System.out.println( "Hello World" );

    System.out.println( "testing Merge!" );
  }

  private static int sum(int a, int b) {
    return a + b;
  }

  private static int minus(int a, int b, Object GPU) {
    int result = 0;
    if( GPU == null ) {
      result = a - b;
    } else {
      result = a - b;
    }
    return result;
  }
}
