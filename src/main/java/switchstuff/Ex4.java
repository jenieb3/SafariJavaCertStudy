package switchstuff;

public class Ex4 {
  public static void main(String[] args) {
    final String s = "Hello";
    var m =
      switch (s) {
        // line n2
        default -> "Unknown";
        case "Hello" -> "Bonjour";
      };
    System.out.println(m);
  }
}
