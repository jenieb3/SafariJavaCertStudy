package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

class AC4 implements AutoCloseable {
  @Override
  public void close() throws Exception {
    throw new SQLException();
  }
}

public class SuppressedEtc {
  public static void main(String[] args) throws Throwable {
//    int [] ia = {1,2,3,};

    try (
      var one = new AC4();
      var two = new AC4();
    ){
//      throw new FileNotFoundException();
    }


    // try with resources creates potentially nested (for multiple resource)
    // try/catch/finally

//    try (
//      FileReader fr = null;
//      ) {
//
//    } // auto-generated finally closes fr!
  }
}
