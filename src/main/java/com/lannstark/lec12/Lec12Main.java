package com.lannstark.lec12;

public class Lec12Main {

  public static void main(String[] args) {
    // Person.Factory.newBaby("ABC");
    
    moveSomething(new Movable() {
      @Override
      public void move() {
        System.out.println("움직인다!!");
      }

      @Override
      public void fly() {
        System.out.println("난다!!");
      }
    });
    
  }

  public static void moveSomething(Movable moveable) {
    moveable.move();
    moveable.fly();
  }

}
