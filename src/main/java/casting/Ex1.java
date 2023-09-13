package casting;

/*final */ sealed class Base permits Sub {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

/*non-sealed*/ final /*sealed*/ class Sub extends Base/* permits SubSub*/ {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

//final class SubSub extends Sub implements Runnable {
//  @Override
//  public void run() {
//    System.out.println("Hah!");
//  }
//}

public class Ex1 {
  public static void main(String[] args) {
    Base b = /*new Sub()*/ null;
//    b.doOtherStuff(); this would be compilation failure Bases do not have other stuff!
//    ((Sub)b).doOtherStuff(); this would succeed
//    int l = ((String)b).length();

//    ((Runnable) b).run();
  }
}
