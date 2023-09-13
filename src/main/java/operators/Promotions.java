package operators;

public class Promotions {
  public static void main(String[] args) {
    short s1 = 10;
    short s2 = 10;
//    short sum = s1 + s2; // nope, it's an int!!!

    int x = -10;
    double y = 3;
    System.out.println(x / y);

    System.out.println(x % y); // REMAINDER!! NOT MOD

    var res = true ? s1 : s2;
  }
}
