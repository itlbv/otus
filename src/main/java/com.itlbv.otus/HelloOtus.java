package com.itlbv.otus;

import com.google.common.base.Joiner;

public class HelloOtus {
  public static void main(String[] args) {
    Joiner joiner = Joiner.on("- ");
    System.out.println(joiner.join("1", "2", "3", "4"));
  }
}