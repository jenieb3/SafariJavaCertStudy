package switchstuff;

public class Ex2 {
  public static void main(String[] args) {
//    Short s = 8;
    short s = 8;
    System.out.println(switch (s) { // line n1
      // line n2
      case 2,4,6,8 -> {
        System.out.println("something specific matched");
        yield "Even < 10";
      }
      default -> "It's something else"; // line n3

//      case 2,4,6,8 :
//        System.out.println("something specific matched");
//        yield "Even < 10"; // yield also does "break" in effect
//      default : yield "It's something else"; // line n3
    });
  }
}
