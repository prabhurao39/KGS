package com.basic.kgs;

public class Application {

  public static void main(String[] args) {
    SequenceGenerator sg = new SequenceGenerator();
    int i = 0;
    while ( i++ < 2) {
      System.out.println(i +  " id : " + sg.nextId());
    }
  }

}
