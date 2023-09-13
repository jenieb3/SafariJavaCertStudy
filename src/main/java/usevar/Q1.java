package usevar;

class X {
//  var x = 99;
}

public class Q1 {
//  void doStuff(var x) { }

// void doStuff() {
//   var x;
//   x = 100;
// }


//  void doStuff() {
////    final long v = 10; // OK if this is int, not long, however
////    short s = v + 4;
//     var x = 100;
//   }


 void doStuff() {
   var x = (String)null; // this is OK!?!?
//   var x = null;
//   x = null;
 }
}
