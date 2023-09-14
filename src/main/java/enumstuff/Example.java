package enumstuff;
enum Day {
  // these are actually, public static final fields of Day type.
  MONDAY(1), TUESDAY;
  /*public*/ Day(int d) {
    System.out.println("d is " + d);
  }
  /*public*/ Day() {
    System.out.println("initializer...");
  }
  static {
    System.out.println("static initializer");
  }

//  @Override
//  public String name() { // FINAL!!!!
//    return "";
//  }
  @Override
  public String toString() { // default of toString is to call name()
    return "MY toString: " + super.toString();
  }
}

public class Example {
  public static void main(String[] args) {
    Day m = Day.MONDAY;
    System.out.println(m);
    switch (m) {
      // NOPE, don't qualify the enum value
//      case Day.MONDAY -> System.out.println("Monday");
      case MONDAY -> System.out.println("Monday");
    }
  }
}
