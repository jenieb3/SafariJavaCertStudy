package defaultstuff;

class ClB {
  public void doStuff() {
    System.out.println("C1B.doStuff");;
  }
}
class C1C extends ClB {}

interface IntA {
  default void doStuff() { System.out.println("IntA.doStuff()"); }
}
interface IntB {
  default void doStuff() { System.out.println("IntB.doStuff()"); }
}
class ClA extends ClB implements IntA, IntB {
//class ClA implements IntA, IntB {
  @Override
  public void doStuff() {
    IntB.super.doStuff();
    System.out.println("C1A.doStuff");;
  }
}

public class Example {
  public static void main(String[] args) {
    new ClA().doStuff();
  }
}

class X {
  static void doStuff() {
    System.out.println("X.doStuff");
  }
}

class Y extends X {

}

class UseY {
  public static void main(String[] args) {
    Y y = new Y();
    y.doStuff(); // Instance prefix for static method invocation!? Yuk
    Y.doStuff();
  }
}