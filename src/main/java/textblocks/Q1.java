package textblocks;

public class Q1 {
  public static void main(String[] args) {
//    String message = """Hello\
//    Java 17 World!""";
    String message = """     
    Hello\
    Java 17 World!""";
    System.out.println(message + "XXX");

    String msg2 = """      
      x\n\n\n\
      ""\"""\"Hello", she said!
          y          """;
    System.out.println(msg2);
    System.out.println(msg2.length());
  }
}

