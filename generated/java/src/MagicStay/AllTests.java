package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class AllTests {
  private DateTest d = new DateTest();
  private EventTest e = new EventTest();
  private PropertyTest p = new PropertyTest();
  private UserTest u = new UserTest();
  private MagicStayTest magicStay = new MagicStayTest();

  public void main() {

    IO.print("*** Running all tests ***\n");
    d.main();
    IO.print("*** Finished testing Dates ***\n");
    e.main();
    IO.print("*** Finished testing Events ***\n");
    p.main();
    IO.print("*** Finished testing Properties ***\n");
    u.main();
    IO.print("*** Finished testing Users ***\n");
    magicStay.main();
    IO.print("***** Finished running the tests *****\n");
  }

  public AllTests() {}

  public String toString() {

    return "AllTests{"
        + "d := "
        + Utils.toString(d)
        + ", e := "
        + Utils.toString(e)
        + ", p := "
        + Utils.toString(p)
        + ", u := "
        + Utils.toString(u)
        + ", magicStay := "
        + Utils.toString(magicStay)
        + "}";
  }
}
