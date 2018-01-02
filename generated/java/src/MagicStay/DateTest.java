package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DateTest extends MyTestCase {
  private Date sdate = new Date(2017L, 3L, 22L);
  private Date edate = new Date(2017L, 3L, 24L);

  private void testCompareDate() {

    assertEqual(edate.compareDate(sdate), true);
    assertEqual(sdate.compareDate(edate), false);
  }

  private void testGetYear() {

    assertEqual(sdate.getYear(), 2017L);
    assertEqual(edate.getYear(), 2017L);
  }

  private void testGetMonth() {

    assertEqual(sdate.getMonth(), 3L);
    assertEqual(edate.getMonth(), 3L);
  }

  private void testGetDay() {

    assertEqual(sdate.getDay(), 22L);
    assertEqual(edate.getDay(), 24L);
  }

  public static void main() {

    DateTest teste = new DateTest();
    teste.testCompareDate();
    teste.testGetYear();
    teste.testGetMonth();
    teste.testGetDay();
  }

  public DateTest() {}

  public String toString() {

    return "DateTest{"
        + "sdate := "
        + Utils.toString(sdate)
        + ", edate := "
        + Utils.toString(edate)
        + "}";
  }
}
