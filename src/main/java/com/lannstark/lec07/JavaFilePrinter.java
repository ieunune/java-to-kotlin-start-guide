package com.lannstark.lec07;

import java.io.*;

public class JavaFilePrinter {

  public static void main(String[] args) throws IOException {
    JavaFilePrinter javaFilePrinter = new JavaFilePrinter();
    javaFilePrinter.readFile();
    javaFilePrinter.readFile("./a.txt");
  }
  public void readFile() throws IOException {
    File currentFile = new File(".");
    File file = new File(currentFile.getAbsolutePath() + "/a.txt");
    try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
      System.out.println(reader.readLine());
    };
  }
  public void readFile(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }

}
