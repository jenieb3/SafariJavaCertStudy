package pattern;

public class Example {
  public static void main(String[] args) {
    Object obj = "Hello";
//    Object obj = "He";

//    if (obj instanceof Object) {}

//    boolean answered = false;
//    if (obj instanceof String) {
//      String str = (String)obj;
//      if (str.length() > 3) {
//        System.out.println(str);
//        answered = true;
//      }
//    }
//    if (!answered) System.out.println("Nope");

//    boolean answered = false;
//    if (obj instanceof String str) {
//      if (str.length() > 3) {
//        System.out.println(str);
//        answered = true;
//      }
//    }
//    if (!answered) System.out.println("Nope");

//    if (obj instanceof String str) {
//      if (str.length() > 3) {
//        System.out.println(str);
//      }
//    }
    System.out.println(obj instanceof String str && str.length() > 3);
    System.out.println(!(obj instanceof String str) || str.length() > 3);


    do {
//      if (Math.random() > 0.5) break;
//      if (Math.random() > 0.5) throw new IllegalArgumentException();
    } while (!(obj instanceof String str2));
    System.out.println(str2);


    System.out.println(obj instanceof String str && str.length() > 3 ? str : "Nope");

    if (!(obj instanceof String str) || str.length() <= 3) System.out.println("Nope");
    else System.out.println(str);
  }
}
