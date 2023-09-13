package usevar;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {
  public static void main(String[] args) throws IOException {
//    var p = 10, q = 11; //nope, not with var
//    for (int x = 0, y = 99, z[] = {1,2,3}; x < 3; x++)
    for (var x = 0; x < 3; x++)
      System.out.println(x);

    var in2 = new FileReader("");
    var out2 = new FileWriter("");
    try (out2;
         in2) {
    }
//    out2 = null; //  must be final or effectively final


    try (var in = new FileReader("");
         var out = new FileWriter("")) {
    }

    FileReader in = new FileReader(""), out = new FileReader("");

//    try (FileReader in = new FileReader(""), out = new FileReader("")) {
//    }

//    try (FileReader in = new FileReader("")) {
//    } catch (var ex) {
//    }
  }

//  void doStuff() {
////    var [] x = new int[]{ 1, 2, 3 }; // NOPE!
//    var x = new int[]{ 1, 2, 3 };
//  }

  void doMoreStuff(int [] ia) {}

  void doStuff() {
//    var x = { 1, 2, 3 };
    doMoreStuff(new int[]{ 1, 2, 3 }); // OK
//    doMoreStuff({ 1, 2, 3 }); // NOPE!
  }
}
