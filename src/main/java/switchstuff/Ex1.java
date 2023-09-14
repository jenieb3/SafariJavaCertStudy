package switchstuff;

public class Ex1 {
  public static void main(String[] args) {
    boolean alsoGerman = false;
    String s = "Hello";
    switch (s) {
      case "Hello" -> {
        int x = 99;
        System.out.print("Bonjour "); // line n1
        if (!alsoGerman) break;
        System.out.print("Guten Tag ");
      }
      case "norThis" -> {int x = 99;}
//      case "Nope" -> break; // NOPE, only "break" in curly block
      default -> System.out.print("Bye");
    }
//    switch (s) {
//      case "Hello" :
//        int x = 99;
//      case "Hi" :
////        int x = 98; // NOPE, previous x is still in scope!
//        System.out.println(x);
//        System.out.print("Bonjour "); // line n1
//        System.out.print("Guten Tag ");
////        break;
//      default : System.out.print("Bye");
//    }
  }
}
