package recordstuff;

//class Person {
//  private String name;
//  private String address;
//  // constructor?
//  // getters/setters?
//  // toString, equals / hashCode?
//  // hence "Lombok"
//}

// record is intended to be an unmodifiable "data carrier"
// subclass of java.lang.Record, but NO extends IS ALLOWED
// they are implicitly final
// CAN implement interfaces
// in the parens are "components"
// we get:
// storage (fields) for the components, private, and final
// access methods for the components, but not mutators
// equals, hashCode, toString
// initialization
record Person(String name, String address){
  // are allowed
  // static fields and initializer but NOT INSTANCE FIELDS nor instance initializers
  // methods, both static an instance
  // "overriding" methods (replacements) for the built in methods

//  @Override // really a "replacement"
//  public String toString() {
//    return "Person... " + super.toString();
//  }

  // control of initialization
  // nested types are implicitly static

  // final fields MUST BE assigned EXACTLY ONCE by the end of the constructor chain
  // canonical constructor looks like this (why would you do this :)
//  Person(String name, String address){
//    // validation here?
//    // "normalization" here?
//    this.name = name; // these two are really going to happen last anyway.
//    this.address = address;
//  }

  // OR "compact" constructor
  Person {
    // NO REFERENCE permitted to this.name
    // (uninitialilzed and will be initialized in the canonical constructor)
    name = name.toUpperCase();
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Person p1 = new Person("Fred", "Over here");
    Person p2 = new Person("Fred", "Over here");
    Person p3 = new Person("Jim", "Round the corner");
    System.out.println(p1);
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
    System.out.println(p1.name());
  }
}
