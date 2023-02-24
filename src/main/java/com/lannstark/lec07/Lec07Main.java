package com.lannstark.lec07;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
    Lec07Main lec07Main = new Lec07Main();
    lec07Main.parseIntOrThrow("10");
    lec07Main.parseIntOrThrow("AA");
  }

  private int parseIntOrThrow(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.", str));
    }
  }

}
