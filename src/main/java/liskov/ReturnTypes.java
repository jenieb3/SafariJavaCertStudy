package liskov;

class Base {
  public CharSequence getMessage() {
    return new StringBuilder("Hellooo!");
  }
  public long getVal() {
    return 1;
  }
}

class Sub extends Base {
  @Override
//  public CharSequence getMessage() {
// Java permits (since Java 5) "covariant" return types
  public String getMessage() {
    return "This too...";
  }

//  @Override
  // NOPE JVM can't handle "structurally different" return
//  public int getVal() {
//    return 1;
//  }
}

public class ReturnTypes {
  public static void main(String[] args) {
//    Base b = new Base();
    Base b = new Sub();
    CharSequence cs = b.getMessage();
    System.out.println(cs);

    long val = b.getVal();
    System.out.println(val);
  }
}
