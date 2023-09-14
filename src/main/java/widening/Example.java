package widening;

public class Example {
//  static void doStuff(int x, int y) {}         // Method A
//  static void doStuff(int x, long y) {}        // Method B
//  static void doStuff(int x, float y) {}        // Method C
//  static void doStuff(float x, int y) {}        // Method C
//  static void doStuff(long x, int y) {}        // Method C
  static void doStuff(int ... x) {}            // Method D
//  static void doStuff(Integer x, Integer y) {} // Method E
//  static void doStuff(Number x, Integer y) {} // Method E
//  static void doStuff(Integer x, Number y) {} // Method E

  public static void main(String[] args) {
    Object obj = 1L;
    doStuff(1, 2);
  }
}

// wideing promotions, but if ambiguous compilation fails NOW
// autoboxing (autoboxing NEVER CHANGES BASIC TYPE ie, int -> Integer
// BUT if autoboxing is ambiguous fail NOW
// varargs comes last
