package usevar;

public class Oddity {
  public static void main(String[] args) {
    var x = true ? "99" : 99;
    x.compareTo(null); // OK!!

    String s = "";
    Integer i = 0;
  }
}
