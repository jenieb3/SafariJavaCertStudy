package exceptions;

class AC implements AutoCloseable {
  private String name;

  public AC(String name) {
    this.name = name;
  }

  @Override
  public void close() {
    System.out.print("Closing " + name);
  }
}

public class CloseOrder {
  public static void main(String[] args) {
    var ac0 = new AC("zero");
    try (
      var ac1 = new AC("one");
      var ac2 = new AC("two");
      ac0;
    ) {
    }
    // use ac0 here!
  }
}
