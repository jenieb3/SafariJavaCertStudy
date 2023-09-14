package enumstuff;

// cannot use extends, even for the actual parent
enum Suit /*extends java.lang.Enum<Suit>*/ {
  HEARTS {
    @Override
    boolean isTrumps() {
      return true;
    }
  },
  DIAMONDS,
  CLUBS,
  SPADES;
  /*final*/ boolean isTrumps() { return false; }
}
//enum Suit /*extends java.lang.Enum<Suit>*/ {
//  HEARTS, DIAMONDS, CLUBS, SPADES;
//  boolean isTrumps() { return this == HEARTS; }
//}

// cannot say "extends" some enum type
//enum Tarot extends Suit {}

public class SubTypeEnums {
  public static void main(String[] args) {
    System.out.println(Suit.HEARTS.isTrumps());
    System.out.println(Suit.DIAMONDS.isTrumps());
    System.out.println(Suit.HEARTS.ordinal());
  }
}
