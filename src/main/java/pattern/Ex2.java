package pattern;

final class Person {
  private String name;
  private String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

//  @Override
//  public boolean equals(Object obj) {
//    if (obj instanceof Person) {
//      Person p = (Person)obj;
//      return p.address.equals(this.address) && p.name.equals(this.name);
//    }
//    return false;
//  }
//
  @Override
  public boolean equals(Object obj) {
    return obj instanceof Person p
      && p.address.equals(this.address)
      && p.name.equals(this.name);
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", address='" + address + '\'' +
      '}';
  }
}
public class Ex2 {
}
