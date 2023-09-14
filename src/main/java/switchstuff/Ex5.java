package switchstuff;

enum Suit {
  HEART, DIAMOND, CLUB, SPADE;
  // constructors, fields, methods...
}

public class Ex5 {
  public static void main(String[] args) {
    Suit s = Suit.HEART;
    var msg = switch (s){
      case HEART -> "It's a heart";
      case CLUB, SPADE -> "It's a black card";
      case DIAMOND -> 1_000_000;
    };
    System.out.println(msg);
  }
}
