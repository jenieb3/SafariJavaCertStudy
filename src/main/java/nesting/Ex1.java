package nesting;

import java.security.spec.RSAOtherPrimeInfo;

class Outer1 {
  class Inner1 {

    Inner1() { // same as below. outer reference is implicit usually
//    Inner1(Outer1 Outer1.this) {
      System.out.println(Outer1.this);
    }

//    static Inner1 makeOne() { return new Inner1(); }
    // hidden variable in objects of this type
//    Outer1 Outer1.this // definitely initialized by construction
    private int y = 100;
//    private int x = 199;
    // line n1
    void showX() {
//      int x = 99;
//      System.out.println("x is " + Outer1.this.x); }
      System.out.println("x is " + x); }
  }
  private int x = 99;
  // line n2
//  void showY() {
//    System.out.println("y is " + y);
//  }
  void showAnotherY(Inner1 another) {
    System.out.println("y is " + another.y);
  }
  void showY(Inner1 thing) {
    System.out.println("y is " + thing.y);
  }
//  static Inner1 makeOne() { return new Inner1(); } // nope!
//  static Inner1 makeOne() {
//    Outer1 outer = new Outer1();
//    Inner1 inner1 = outer.new Inner1();
//    Inner1 inner2 = outer.new Inner1();
//    Inner1 inner3 = outer.new Inner1();
//    return inner3;
//  }
}

/*
void showX() { sop("x is " + x); }
void showY() { sop("y is " + y); }
void showAnotherY(Inner1 another) { sop("y is " + another.y); }
static Inner1 makeOne() { return new Inner1(); }
public class Ex1 {
}
*/
