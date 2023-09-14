package closure;

import java.util.function.Predicate;

public class Ex1 {
  public static Predicate<String> doStuff() {
    /*final*/ int len = 3;
//    Predicate<String> ps = (String s) -> {
//        return s.length() > len; // line n1
//      };
//    Predicate<String> ps = (@Annotate var s) -> {
    Predicate<String> ps = s -> s.length() > len   ;

//    Predicate<String> ps = new Predicate<String>() {
//      @Override
//      public boolean test(String s) {
//        return s.length() > len; // line n1
//        // len is a COPY of the local var, and "both" must be
//        // final/effectively-final
//      }
//    };
    // line n2
//    System.out.println("testing lines " + (++len));
    return ps;
  }

  public static void main(String[] args) {
    String little = "H";
    String big = "Hello";

    Predicate<String> isLong = doStuff();
    System.out.println(isLong.test(little));
    System.out.println(isLong.test(big));
  }
}
