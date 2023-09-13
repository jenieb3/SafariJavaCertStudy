package resolution;

class Thing {
  static int x = 99;

//  void showIt() {
//  static void showIt(Thing this) {
  static void showIt(Thing t) {
    int x = 98;
//    System.out.println("x is " + this.x);
    System.out.println("x is " + Thing.x);
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Thing.showIt(new Thing());
  }
}
